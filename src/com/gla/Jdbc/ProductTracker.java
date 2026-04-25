import java.sql.*;
public class ProductTracker {
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
Statement st=con.createStatement();
st.executeUpdate("create table if not exists product(pid int,pname varchar(50),qty int)");
st.executeUpdate("insert into product values(1,'Pen',5)");
st.executeQuery("select * from product where qty<10");
st.executeUpdate("update product set qty=qty+10 where pid=1");
st.executeUpdate("delete from product where pid=3");
con.close();
}catch(Exception e){System.out.println(e);}
}}