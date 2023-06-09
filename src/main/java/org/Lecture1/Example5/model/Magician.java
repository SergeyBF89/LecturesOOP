package org.Lecture1.Example5.model;

public class Magician extends BaseHero{
    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician %d", Magician.number++), Magician.random.nextInt(150, 200));
        this.maxMana = Magician.random.nextInt(100, 150);
        this.mana = maxMana;
    }
    public String getInfo() {
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
}
