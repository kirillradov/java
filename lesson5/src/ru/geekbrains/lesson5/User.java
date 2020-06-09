package ru.geekbrains.lesson5;

public class User {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int zp;
    private int age;

    public User(String fio, String position, String email, String phone, int zp, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.zp = zp;
        this.age = age;
    }

    public  int getAge() {
        return age;
    }

    public void info() {
        System.out.println("ФИО: " + fio +", должность: " + position + ", e-mail: " +
                email + ", телефон: " + phone + ", зарплата: " + zp + " руб., " +
                "возраст: " + age + " лет.");
    }
}
