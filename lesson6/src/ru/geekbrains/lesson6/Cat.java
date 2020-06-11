package ru.geekbrains.lesson6;

public class Cat extends Animal {
    private double runLimit = 200;
    private double jumpLimit = 2;


    public Cat(String name, String color, int age, double runLimit, double jumpLimit) {
        super(name, color, age);
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run(double dist) {
        if (dist <= this.runLimit) {
            System.out.println("Кот " + name + " пробежал: " + dist + " метров.");
        } else System.out.println("Кот " + name + " не смог пробежать.");
    }

    @Override
    public void swim(double dist) {
        System.out.println("кот не умеет плавать.");
    }

    @Override
    public void jump(double height) {
        if (height <= this.jumpLimit) {
            System.out.println("Кот " + name + " прыгнул на: " + height + " метров.");
        } else System.out.println("Кот " + name + " не смог прыгнуть.");
    }

    public void setRunLimit(double dist) {
        this.runLimit = dist;
    }

    public void setJumpLimit(double dist) {
        this.jumpLimit = dist;
    }

}
