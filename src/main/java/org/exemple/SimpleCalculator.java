package org.exemple;

public class SimpleCalculator {
    public int Addition(int num1, int num2){
        int s=num1+num2;
        return s;
    }
    public int soustraction(int num1, int num2){
        int s=num1-num2;
        return s;
    }
    public int multiplication(int num1, int num2){
        int s=num1*num2;
        return s;
    }
    public boolean isEven(int value) {
        if (value %2== 0){
            return true;
        } else
            return false;
    }
}
