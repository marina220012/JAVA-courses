package home_work_1;
import java.util.Scanner;
import java.util.Objects;

public class WhatHappen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a name: ");
        String Name = in.nextLine();
        if(Objects.equals(Name, "Вася"))
            System.out.println("Привет!" );
        if (Objects.equals(Name, "Анастасия") || Objects.equals(Name, "Вася"))
            System.out.println("Я тебя так долго ждал");
        if(!Objects.equals(Name, "Анастасия") && !Objects.equals(Name, "Вася"))
            System.out.println("Добрый день, а вы кто?");

        in.close();
    }
}
