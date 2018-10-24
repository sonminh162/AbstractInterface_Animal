package com.company;

abstract class Animal{
    public abstract String makeSound();
}

class Tiger extends Animal{
    public String makeSound(){
        return "Tiger: roarrrr~";
    }
}
class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: cluck - cluck";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
interface Edible{
    String howToEat();
}
abstract class Fruit implements Edible{
}
class Apple extends Fruit{
    @Override
    public String howToEat(){
        return "Apple could be slided";
    }
}
class Orange extends Fruit{
    @Override
    public String howToEat(){
        return "Orange could be juiced";
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for(Animal animal : animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edibler = (Chicken)animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for(Fruit fruit : fruits)System.out.println(fruit.howToEat());
    }
}
