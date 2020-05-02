package ru.progwards.java1.lessons.classes;

public class Duck extends Animal{
    Animal animal = new Animal();
    AnimalKind duck = AnimalKind.DUCK;
    FoodKind food = FoodKind.CORN;

    @Override
    public AnimalKind getKind() {
        return duck;
    }

    @Override
    public FoodKind getFoodKind() {
        return food;
    }
    public double getFoodCoeff(){
        return 0.04;
    }
}
