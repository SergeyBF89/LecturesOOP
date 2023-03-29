package org.Lecture1.Example4.model;

import java.util.ArrayList;

public class Robot3 {
    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<>();
    }

    /**
     * Уровень робота
     */

    private int level;

    /**
     * Имя робота
     */

    private String name;

    /**
     * Новое поле (состояние)
     */

    private State state;

    /**
     * Создание робота
     *
     * @param name  Имя робота (не должно начинаться с цифры)
     * @param level уровень робота
     */

    private Robot3(String name, int level) {
        if (name.isEmpty() || Character.isDigit(name.charAt(0)) || Robot3.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }
        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    /** Вызывает имеющийся конструктор с 2 аргументами */
    public Robot3(String name) {
        this(name, 1);
    }

    /** конструктор без параметров, имеет пустую строку */
    public Robot3() {
        this("");
    }

    // Методы вкл\ выкл подсистем

    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    /** Включение системы */

    public void powerOn() {
        this.startBios();
        this.startOS();
        this.sayHi();
    }

    /** Выключение системы */

    public void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    /**
     * Методы чтения полей
     * @return поля
     */
    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    /** Загрузка BIOS */
    private void startBios() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа */
    public void work() {
        if (this.state == State.On) {
            System.out.println("Working...");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}

