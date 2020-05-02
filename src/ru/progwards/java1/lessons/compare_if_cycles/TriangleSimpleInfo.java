package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c){
      int x = 0;
        if(a>=b && a>=c){
            x=a;
        } else if(b>=c && b>=a){
            x=b;
        } else if (c>=a && c>=b){
            x=c;
        }
        return x;
    }
    public static int minSide(int a, int b, int c){
        int x = 0;
        if(a<=b && a<=c){
            x=a;
        } else if(b<=c && b<=a){
            x=b;
        } else if (c<=a && c<=b){
            x=c;
        }
        return x;
    }


    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean x = false;
        if(a==b && b==c && c==a){
            x=true;

        } else{
            x= false;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(maxSide(1,1,1));
        System.out.println(minSide(3,2,10));
        System.out.println(isEquilateralTriangle(13,13,4));
    }
}
