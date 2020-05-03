package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    public int a;
    public int b;

    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return a+"+"+b+"i";
    }

    public ComplexNum add(ComplexNum num){
        int x = this.a+num.a;
        int y = this.b+num.b;
        ComplexNum n = new ComplexNum(x,y);
        return n;
    }

    public ComplexNum sub(ComplexNum num){
    // вычисление по формуле (a - c) + (b - d)i
        int x = this.a-num.a;
        int y = this.b-num.b;
        ComplexNum n = new ComplexNum(x,y);
        return  n;
    }
    public ComplexNum mul(ComplexNum num){
    // вычисление по формуле(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    // где переменные a & b = ссылаются на num1
    // а переменные с & в = ссылаются на num2
        int x = this.a*num.a-this.b*num.b;
        int y = this.b*num.a+this.a*num.b;
        ComplexNum n = new ComplexNum(x,y);
        return n;
    }
    public ComplexNum div(ComplexNum num){
    //вычисление по формуле (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    // где переменные a & b = ссылаются на num1
    // а переменные с & в = ссылаются на num2
        int x = (this.a*num.a+this.b*num.b)/(num.a*num.a+num.b*num.b);
        int y = (this.b*num.a-this.a*num.b)/(num.a*num.a+num.b*num.b);
        ComplexNum n = new ComplexNum(x,y);
        return n;
    }
    public static void main(String[] args) {


        ComplexNum num1 = new ComplexNum(1,1);
        ComplexNum num2 = new ComplexNum(99,99);
        System.out.println(num1.add(num2));
        System.out.println(num1.sub(num2));
        System.out.println(num1.mul(num2));
        System.out.println(num1.div(num2));

    }

}
