
package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r){
        Double s = 4*3.14*Math.pow(r,2);
        return s;
    }
    public static Double earthSquare(){
        return sphereSquare(6371.2);
    }
    public static Double mercurySquare(){
        return sphereSquare(2439.7);
    }

    public static Double jupiterSquare(){
        return  sphereSquare(71492.0);
    }
    public static Double earthVsMercury(){
        return earthSquare()/mercurySquare();
    }
    public static Double earthVsJupiter(){
        return earthSquare()/jupiterSquare();
    }

    public static void main(String[] args) {
        System.out.println( "Earth = " + earthSquare()+"\n"+
                "Mercury = " + mercurySquare()+"\n"+
                "Jupiter = "+ jupiterSquare()+"\n"+
                "Earth vs Mercury = "+ earthVsMercury()+"\n"+
                "Earth vs Jupiter = " + earthVsJupiter());
    }
}