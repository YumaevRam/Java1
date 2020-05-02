package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean x = false;
        if(a+b>c & a+c>b & c+b>a){
            x=true;
        } else {
            x=false;
        }
        return x;
    }
    public static boolean isRightTriangle(int a, int b, double c){
        boolean x=false;
        if(a*a+b*b==c*c){
            x=true;
        }else if(b*b+c*c==a*a){
            x=true;
        }else if(c*c+a*a==b*b){
            x=true;
        }else{
            x=false;
        }
        return x;

    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean x = false;
        if(a==b || b==c || c==a){
            x=true;
        } else {
            x=false;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(3,2,4));
        System.out.println(isRightTriangle(4,3,5));
        System.out.println(isIsoscelesTriangle(4,4,3));
    }

    }