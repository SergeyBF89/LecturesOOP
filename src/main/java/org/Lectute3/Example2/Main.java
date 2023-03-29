package org.Lectute3.Example2;

import org.Lectute3.Example2.model.Beans;
import org.Lectute3.Example2.model.Beverage;
import org.Lectute3.Example2.model.Coffee;
import org.Lectute3.Example2.model.Ingredient;
import org.Lectute3.Example2.model.Milk;
import org.Lectute3.Example2.model.Water;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Beverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зерна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
