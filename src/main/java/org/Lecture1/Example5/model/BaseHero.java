package org.Lecture1.Example5.model;

import java.util.Random;

public class BaseHero {
    public static int number;
    public static Random random;
    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 1;
        random = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero_Priest %d", BaseHero.number++), BaseHero.random.nextInt(150, 200));
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public String getInfo() {
        return String.format("Name: %s Hp: %d Type: %s", this.name, this.hp, this.getClass().getSimpleName());
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    public void Attack(BaseHero target) {
        int damage = BaseHero.random.nextInt(10, 50);
        target.GetDamage(damage);
    }
}
