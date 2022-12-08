package org.exemple;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        SimpleCalculator calculator=new SimpleCalculator();
        RegistrattionUtil enregistrement=new RegistrattionUtil();
        int result=calculator.Addition(2,3);
        boolean resul= calculator.isEven(4);
        boolean valeur=enregistrement.validateUserInput("Diaby","1234","1234");
        System.out.println(result);
        System.out.println(resul);
    }

}
