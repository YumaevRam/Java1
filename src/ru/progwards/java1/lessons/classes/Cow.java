package ru.progwards.java1.lessons.classes;

public class Cow extends Animal{
    Animal animal = new Animal();
    AnimalKind cow = AnimalKind.COW;
    FoodKind food = FoodKind.HAY;
    @Override
    public AnimalKind getKind() {
        return cow;
    }
    @Override
    public FoodKind getFoodKind() {
        return food;
    }

    @Override
    public double getFoodCoeff() {
        return 0.05;
    }
}
