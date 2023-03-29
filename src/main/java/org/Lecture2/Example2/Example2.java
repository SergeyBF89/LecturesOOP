package org.Lecture2.Example2;

import org.Lecture2.Example2.model.BaseHero;
import org.Lecture2.Example2.model.Druid;
import org.Lecture2.Example2.model.Magician;
import org.Lecture2.Example2.model.Priest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {

        int teamCount = 10;
        Random rand = new Random();


        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    teams.add(new Priest());
                    break;
                case 1:
                    teams.add(new Magician());
                    break;
                case 2:
                    teams.add(new Druid());
                    break;
                default:
                    teams.add(new BaseHero() {
                        @Override
                        public void die() {

                        }
                    });
                    break;

            }
            System.out.println(teams.get(i).getInfo());
        }

        System.out.println();


        BaseHero hero = new BaseHero() {
            @Override
            public void die() {

            }
        };
        System.out.println(hero.getInfo());
        Priest priest = new Priest();
        System.out.println(priest.getInfo());
        Druid druid = new Druid();
        System.out.println(druid.getInfo());
        Magician magician = new Magician();
        System.out.println(magician.getInfo());

        priest.attack(magician);
        System.out.println(magician.getInfo());
        priest.attack(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
    }

}
