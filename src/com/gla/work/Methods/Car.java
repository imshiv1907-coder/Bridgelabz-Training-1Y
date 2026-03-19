package com.gla.work.Methods;

public class Car {
    //public static void main (String[] args){
        String name;
        String company;
        long price;
        String model;

        public Car(String name,String company,String model,long price){
            this.name=name;
            this.company=company;
            this.price=price;
            this.model=model;
        }
        void printCompany(){
            System.out.println(company);

        }
        public static void main(String[] args){
            Car c1= new Car("ABC","Tesla","asd",80000000);
           c1.printCompany();

        }
}
