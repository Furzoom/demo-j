package com.furzoom.lab;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private Color color;
    
    public Cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cat cat = (Cat)obj;
        return (name.equals(cat.name)) && (age == cat.age) 
            && (weight == cat.weight) && (color.equals(color));
    }

    public int hashCode() {
        return 7 * name.hashCode() + 11 * new Integer(age).hashCode()
            + 13 * new Double(weight).hashCode() * 17 * color.hashCode();
    }
}

