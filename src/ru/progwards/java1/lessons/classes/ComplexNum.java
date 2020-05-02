package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    public int a;
    public int b;
    public int c;
    public int d;

    ComplexNum(){

    }
    public ComplexNum(int a, int b){
        this();
        this.a = a;
        this.b = b;

    }
    public ComplexNum(int a, int b, int c, int d){
        this();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String toString(){
        return a+"+"+b+"i";
    }

    public ComplexNum add(ComplexNum num){
        int n2 = num.a+num.c;
        int n3 = num.b+num.d;
        ComplexNum nu = new ComplexNum(n2,n3);
        return  nu;
    }
    public ComplexNum sub(ComplexNum num){
        int n2 = num.a-num.c;
        int n3 = num.b-num.d;
        ComplexNum nu = new ComplexNum(n2,n3);
        return  nu;
    }
    public ComplexNum mul(ComplexNum num){
        int n2 = num.a*num.c-num.b*num.d;
        int n3 = num.b*num.c+num.a*num.d;
        ComplexNum nu = new ComplexNum(n2,n3);
        return nu;
    }
    public ComplexNum div(ComplexNum num){
        int n2 = (num.a*num.c+num.b*num.d)/(num.c*num.c+num.d*num.d);
        int n3 = (num.b*num.c-num.a*num.d)/(num.c*num.c+num.d*num.d);
        ComplexNum nu = new ComplexNum(n2,n3);
        return nu;
    }
    public static void main(String[] args) {
        ComplexNum n1 = new ComplexNum();
        ComplexNum num = new ComplexNum(8,6,4,2);
        System.out.println(n1.add(num));
        System.out.println(n1.sub(num));
        System.out.println(n1.mul(num));
        System.out.println(n1.div(num));
    }

}
