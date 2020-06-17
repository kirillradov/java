package ru.geekbrains.lesson7;

public class Bowl {
    private int capacity;
    private int foodAmount;

    public Bowl(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void increaseFood(int food) {
        if (food > 0 && (food + this.foodAmount) <= capacity) {
            this.foodAmount += food;
            System.out.println("Миска наполнена успешно. Еды: " + foodAmount);
        } else {
            System.out.println("Миска не может быть наполнена.");
        }
    }

    public int getFoodAmount() {
        return this.foodAmount;
    }

    public boolean decreaseFood(int food) {
        if (food > 0 && food <= this.foodAmount && (this.foodAmount - food) >= 0) {
            this.foodAmount -= food;
            return true;
        } else {
            return false;
        }

    }
}
