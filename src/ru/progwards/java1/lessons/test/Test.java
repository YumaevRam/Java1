package ru.progwards.java1.lessons.test;

public class Test {
    static long factorial(long n){
        long x =1;
        for(long i=1;i<=n;i++){
            x=x*i;
        }
        return x;
    }
    static int addAsStrings(int n1, int n2){
        Integer x1 = n1;
        Integer x2 = n2;
        String s1 = x1.toString();
        String s2 = x2.toString();
        String s3 = s1+s2;
        Integer x3 = Integer.parseInt(s3);
        return x3;

    }

    static String textGrade(int grade){
        String s;
        if(grade>=1 && grade<=20){
            s="очень плохо";
            System.out.println("очень плохо");

        } else if(grade>=21 && grade<=40){
            s="плохо";
            System.out.println("плохо");

        } else if(grade>=41 && grade<=60){
            s="удовлетворительно";
            System.out.println("удовлетворительно");

        } else if(grade>=61 && grade<=80){
            s="хорошо";
            System.out.println("хорошо");

        } else if(grade>=81 && grade<=100){
            s="отлично";
            System.out.println("отлично");

        } else if(grade==0){
            s="не оценено";
            System.out.println("не оценено");

        } else{
            s= "не определено";
            System.out.println("не определено");
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Сделаю коммит, запушу в репо: робот, проверяй теперь всё это...");
        System.out.println(factorial(5));
        System.out.println(addAsStrings(3,4));
        System.out.println(textGrade(101));
    }
}
