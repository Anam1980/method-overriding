package com.driver;

public class Main {

    public  static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {

        //step 3
        B b1 = new B();
        System.out.println(b1.meth());//calling the meth of A with ojbect B as meth not present in B

        //step 5

        System.out.println(b1.meth());//calling the meth of B with object B as it is present in B so it executes



    }
}