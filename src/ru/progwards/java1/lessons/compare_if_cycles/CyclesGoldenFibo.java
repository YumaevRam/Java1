package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
       boolean c=false;
        int x=1;
        Integer u=number;
        String s = u.toString();
        for (int i = s.length(); i >= 1; i--) {
            int  z = (number % (x * 10)) / x;
            x *= 10;
            System.out.println("z "+z);
            if (digit == z) {
                System.out.println("вот это число: "+z);
                c = true;
                break;
            } else {
                c = false;
            }
        }
        return c;
    }
    public static int fiboNumber(int n) {
        int x1=1;
        int x2=1;
        int x3=0;

        if(n==1 | n==2){
            x3=1;
            System.out.println("___");
            System.out.println(x3);
            return x3;
        } else{
            for (int i=0;i<=n-3;i++){
                x3=x1+x2;
                x1=x2;
                x2=x3;

                System.out.println("__");
                System.out.println(x3);
            }
        }


        return x3;
    }
    public static boolean isGoldenTriangle(int a, int b, int c){
        boolean x = false;

            if(a==b & (c<a && c<b)){
                Double a1 = (double) a/c;
                System.out.println(a1);
                if(1.61703<a1 & a1<1.61903){
                    x=true;
                    System.out.println(a1);
                } else {
                    x=false;}
            } else if(b==c &(a<b && a<c)) {
                Double b1 = (double) b/a;
                System.out.println(b1);
                if(1.61703<b1 & b1<1.61903){
                    x=true;
                    System.out.println(b1);
                } else {
                   x=false;}
            } else if(c==a & (b<c && b<a)) {
                Double c1 = (double) c/b;
                if(1.61703<c1 & c1<1.61903){
                    x=true;
                    System.out.println(c1);
                }
            } else {
             x=false;
            }
        return x;
       }
 public static void main(String[] args) {
        System.out.println(containsDigit(13748620, 3));
        System.out.println("fidoNumber "+ fiboNumber(1));
        System.out.println(isGoldenTriangle(16,6,16));

    }
}