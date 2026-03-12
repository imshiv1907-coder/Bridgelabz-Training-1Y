package college.main;

import college.student.*;
import college.faculty.*;
import college.department.*;

public class MainApp {

    public static void main(String[] args){

        Student s=new Student();
        Faculty f=new Faculty();
        Department d=new Department();

        s.show();
        f.show();
        d.show();
    }
}