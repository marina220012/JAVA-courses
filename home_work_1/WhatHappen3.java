package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class WhatHappen3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a name: ");
        String Name = in.nextLine();
        switch (Name){
            case "Вася":
                System.out.println("Привет!" +"Я тебя так долго ждал" ); break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал"); break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
        in.close();
    }
}
