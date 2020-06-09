package ru.geekbrains.lesson5;

public class Main {

    public static void main(String[] args) {
	User user1 = new User("Пушкин Александр Сергеевич", "писатель", "pushkin@russia.ru",
            "71234567890", 100000, 37);

	user1.info();

	User[] usersArray = new User[5];

	usersArray[0] = new User("Иваныч", "токарь", "нету",
            "кнопочный", 40000, 55);
	usersArray[1] = new User("Михалыч", "фрезеровщик", "нету",
                "nokia", 48000, 58);
	usersArray[2] = new User("Толян", "охранник", "tolik228@mail.ru",
                "9153334445", 30000, 38);
	usersArray[3] = new User("Баба Нюра", "уборщица", "нету",
                "нету", 23000, 65);
	usersArray[4] = new User("Владимир Владимирович", "гендиректор", "vovan_vovanich@mail.ru",
                "9997777777", 250000, 39);

	System.out.println();

	for(int i = 0; i < usersArray.length; i++) {
	    if(usersArray[i].getAge() >= 40) {
	        usersArray[i].info();
        }
    }


    }

}
