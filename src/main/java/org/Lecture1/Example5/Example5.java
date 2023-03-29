package org.Lecture1.Example5;

import org.Lecture1.Example5.model.BaseHero;
import org.Lecture1.Example5.model.Magician;
import org.Lecture1.Example5.model.Priest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int teamCount = 10;
        Random random = new Random();
        int magicianCount = 0;
        int priestCount = 0;

        List<BaseHero> heroList = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            if (random.nextInt(2) == 0) {
                heroList.add(new Priest());
                priestCount++;
            } else {
                heroList.add(new Magician());
                magicianCount++;
            }
            System.out.println(heroList.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicianCount: %d priestCount %d\n\n", magicianCount, priestCount);

    }
}
