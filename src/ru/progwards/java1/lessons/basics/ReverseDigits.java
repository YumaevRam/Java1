package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static double fractional(double num){
        return num%1;
    }
    public static int reverseDigits(int number){
        Integer [] n = {number%10,(number%100)/10,(number-number%10)/100};
        return Integer.parseInt(n[0].toString()+n[1].toString()+n[2].toString());
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(486)+ "\n"+
                fractional(5.53));

    }
}
