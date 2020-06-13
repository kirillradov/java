package ru.geekbrains.lesson7;

public class Bowl {
    private int capacity;
    private int foodAmount;

    public Bowl(int capacity) {
        this.capacity = capacity;
    }

    public void getCapacity() {
        System.out.println(this.capacity);
    }

    public void setFoodAmount(int food) {
        if(food > 0 && (food + this.foodAmount) <= capacity) {
            this.foodAmount += food;
            System.out.println("Миска наполнена успешно. Еды: " + foodAmount);
        } else {
            System.out.println("Миска не может быть наполнена.");
        }
    }

    public void getFoodAmount() {
        System.out.println(this.foodAmount);
    }

    public void decreaseFood(int food) {
        if(food > 0 && food <= this.foodAmount && (this.foodAmount - food) >= 0) {
            this.foodAmount -= food;
            System.out.println("Котик покушал. Еды осталось: " +foodAmount);
        } else {
            System.out.println("Не удалось покушать. (");
        }

    }
}
