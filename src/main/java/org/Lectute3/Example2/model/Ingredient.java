package org.Lectute3.Example2.model;

public abstract class Ingredient {
        public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}
