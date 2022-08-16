package ru.geekbrains.java_core.lesson3.HomeWork;

import java.util.ArrayList;

public class BoxFruit<F> {

    private double weightFruit = 0.0;
    ArrayList<F> fruits = new ArrayList();

    public <F> BoxFruit(double weightFruit) {
        this.weightFruit = weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight() {
        return fruits.size() * weightFruit;
    }

    public boolean compare(BoxFruit<?> box) {
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(BoxFruit<F> boxFruit) {
        System.out.println();
        System.out.println("Количество яблок в коробке 1: " + fruits.size());
        System.out.println("Количество яблок в коробке 3: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println();
        System.out.println("Пересыпим яблоки из коробки 3 в коробку 1:");
        System.out.println("Количество яблок в коробке 1: " + fruits.size());
        System.out.println("Количество яблок в коробке 3: " + boxFruit.fruits.size());
    }

}
