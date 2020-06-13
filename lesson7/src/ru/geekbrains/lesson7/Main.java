package ru.geekbrains.lesson7;

public class Main {

    public static void main(String[] args) {
	Bowl bowl = new Bowl(100);

	bowl.getCapacity();
	bowl.setFoodAmount(100);
    bowl.getFoodAmount();
    bowl.decreaseFood(3);
    bowl.decreaseFood(97);
    bowl.decreaseFood(0);
    bowl.setFoodAmount(15);
    bowl.decreaseFood(11);

    }
}
