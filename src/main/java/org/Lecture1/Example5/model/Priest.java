package org.Lecture1.Example5.model;

public class Priest extends BaseHero {
    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest %d", Magician.number++), Magician.random.nextInt(150, 200));
        this.maxElixir = Magician.random.nextInt(100, 150);
        this.elixir = maxElixir;
    }

    public String getInfo() {
        return String.format("%s Elixir: %d", super.getInfo(), this.elixir);
    }
}
