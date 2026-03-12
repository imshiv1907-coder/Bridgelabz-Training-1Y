package com.access.one;

public class Base {

    public void publicMethod(){
        System.out.println("Public");
    }

    protected void protectedMethod(){
        System.out.println("Protected");
    }

    void defaultMethod(){
        System.out.println("Default");
    }

    private void privateMethod(){
        System.out.println("Private");
    }
}