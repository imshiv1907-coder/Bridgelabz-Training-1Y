import java.sql.*;
public class EmployeeManager {
public static void main(String[] args){
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
Statement st=con.createStatement();
st.executeUpdate("create table if not exists employee(id int,name varchar(50),salary double)");
st.executeUpdate("insert into employee values(1,'Aman',25000)");
st.executeQuery("select * from employee where salary>30000");
st.executeUpdate("update employee set salary=salary*1.10 where id=1");
st.executeUpdate("delete from employee where salary<15000");
con.close();
}catch(Exception e){System.out.println(e);}
}}