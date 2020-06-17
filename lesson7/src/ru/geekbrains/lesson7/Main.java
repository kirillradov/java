package ru.geekbrains.lesson7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bowl bowl = new Bowl(100);

        bowl.increaseFood(100);


        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", 10));
        cats.add(new Cat("Мурзик", 20));
        cats.add(new Cat("Мурка", 6));
        cats.add(new Cat("Рыжик", 10));
        cats.add(new Cat("Черный", 11));
        cats.add(new Cat("Муська", 7));

        for (int i = 0; i < cats.size(); i++) {
            cats.get(i).eat(bowl);
            if (cats.get(i).getSatiety()) {
                System.out.println("Котик " + cats.get(i).getName() + " покушал (=^ ◡ ^=)");
            } else System.out.println("Котик " + cats.get(i).getName() + " не смог покушать :(");
            System.out.println("В миске осталось " + bowl.getFoodAmount() + " еды.");
        }


    }
}
