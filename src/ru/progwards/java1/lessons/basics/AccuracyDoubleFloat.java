package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius){
        double res = Math.pow(radius,3);
        return 4.0/3.0*3.14*res;
    }

    public static float volumeBallFloat(float radius){
        float res = (float) Math.pow(radius, 3);
        return (float)4/(float)3.0*3.14f*res;
    }

    public static double calculateAccuracy(double radius){
        return volumeBallDouble(radius)-volumeBallFloat((float)radius);
    }
    public static void main(String[] args) {
        double r = 6371.2;
        System.out.println(volumeBallDouble(r));
        System.out.println(volumeBallFloat((float)r));
        System.out.println(calculateAccuracy(r));
    }
}
