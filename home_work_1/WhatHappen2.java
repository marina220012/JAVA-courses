package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class WhatHappen2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a name: ");
        String Name = in.nextLine();
        if(Objects.equals(Name, "Вася"))
            System.out.println("Привет!" +"Я тебя так долго ждал" );
            else if (Objects.equals(Name, "Анастасия"))
                 System.out.println("Я тебя так долго ждал");
                else System.out.println("Добрый день, а вы кто?");

        in.close();
    }
}
