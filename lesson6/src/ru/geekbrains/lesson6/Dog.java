package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private double runLimit = 500;
    private double jumpLimit = 0.5;
    private double swimLimit = 10;



    public Dog(String name, String color, int age, double runLimit, double jumpLimit,
               double swimLimit) {
        super(name, color, age);
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;

    }

    @Override
    public void run(double dist) {
        if (dist <= this.runLimit) {
            System.out.println("Собака " + name + " пробежала: " + dist + " метров.");
        } else System.out.println("Собака " + name + " не смогла пробежать.");
    }

    @Override
    public void swim(double dist) {
        if (dist <= this.swimLimit) {
            System.out.println("Собака " + name + " проплыла: " + dist + " метров.");
        } else System.out.println("Собака " + name + " не смогла проплыть.");
    }

    @Override
    public void jump(double height) {
        if (height <= this.jumpLimit) {
            System.out.println("Собака " + name + " прыгнула на: " + height + " метров.");
        } else System.out.println("Собака " + name + " не смогла прыгнуть.");
    }


}
