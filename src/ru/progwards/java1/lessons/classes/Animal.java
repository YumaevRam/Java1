package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    AnimalKind animal = AnimalKind.ANIMAL;
    FoodKind food = FoodKind.UNKNOWN;
    public Animal(){

    }
    public Animal(double weight){
        this.weight=weight;
    }


enum AnimalKind{
    ANIMAL,
    COW,
    DUCK,
    HAMSTER
 }

    public AnimalKind getKind(){

        return animal;
    }
enum FoodKind{
    UNKNOWN,
    HAY,
    CORN
}
    public FoodKind getFoodKind() {

    return food;
    }

    public String toString() {
        return "I am "+getKind()+", eat "+getFoodKind();
    }

    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){
        return 0.02;
    }
    public double calculateFoodWeight(){
        return getWeight()*getFoodCoeff();
    }
    public String toStringFull(){
        return "I am"+ getKind()+", eat "+ getFoodKind()+" "+ calculateFoodWeight();
    }
}