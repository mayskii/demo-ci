package com.example;

public class Main {
    public static void main(String[] args) {
        // Вызов метода из App
        String message = App.greet();
        System.out.println(message);

        // Дополнительно — простой цикл для примера
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}