package ru.progwards.java1.lessons.classes;

public class Hamster extends  Animal{
    Animal animal = new Animal();
    AnimalKind hamster = AnimalKind.HAMSTER;
    FoodKind food = FoodKind.CORN;
    @Override
    public AnimalKind getKind() {
        return hamster;
    }

    @Override
    public FoodKind getFoodKind() {
        return food;
    }
    public double getFoodCoeff(){
        return 0.03;
    }
}
