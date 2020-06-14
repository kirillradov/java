package ru.geekbrains.lesson7;

public class Cat {
    private boolean satiety = false;
    private int appetite = 10;
    private String name;

    public Cat(String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
    }

    public void eat(Bowl bowl) {
        boolean a = bowl.decreaseFood(appetite);
        if (a) {
            this.satiety = true;
        }
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return this.appetite;
    }

    public String getName() {
        return this.name;
    }
}
