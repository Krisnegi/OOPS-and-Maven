package com.newyears;

public abstract class Sweets implements Comparable<Sweets> {
    String name;
    int weight;
    int calories;
    int price;
    public Sweets(){}
    public Sweets(String name, int weight, int calories, int price) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.price = price;
    }
    public int compareTo(Sweets s)
    {
        return this.calories-s.calories;
    }
    public String toString()
    {
        return name;
    }
}
