package ru.geekbrains.lesson6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	int cats = 0;
    	int dogs = 0;

		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(new Cat("Мяу1", "белый", 2,700,2));
		zoo.add(new Cat("Мяу2", "серый", 2,400,3));
		zoo.add(new Cat("Мяу3", "черный", 2,500,1));
		zoo.add(new Dog("Гаф1", "коричневый", 2, 800,1,10));
		zoo.add(new Dog("Гаф2", "пятнистый", 4, 700,1.4,15));
		zoo.add(new Dog("Гаф3", "белый", 1, 1100,2,20));

		zoo.get(1).run(350);
		zoo.get(0).jump(5);
		zoo.get(3).swim(3);
		zoo.get(2).swim(2);

		for(int i = 0; i < zoo.size(); i++) {
			if(zoo.get(i).getClass().getName().equals("ru.geekbrains.lesson6.Dog")) {
				dogs++;
			} else if(zoo.get(i).getClass().getName().equals("ru.geekbrains.lesson6.Cat")) {
				cats++;
			}
		}
		System.out.println("Животных: " + zoo.size() + ". Собак: " + dogs + ". Котов: " + cats);
    }
}
