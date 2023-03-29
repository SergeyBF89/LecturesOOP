package org.Lecture1.Example4.model;

public class Robot2 {
    /** Уровень робота */

    private int level;

    /** Имя робота */

    private String name;

    /**
     * Создание робота
     * @param name Имя робота (не должно начинаться с цифры)
     * @param level уровень робота
     */

    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Методы вкл\ выкл подсистем

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
        System.out.println("Working...");
    }

}
