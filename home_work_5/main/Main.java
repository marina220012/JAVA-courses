package home_work_5.main;

import home_work_5.dto.EasySearch;

public class Main {
    public static void main(String[] args) {
        EasySearch findIndex=new EasySearch();
        System.out.println( findIndex.search
                ("привет сколько я не видела тебя не смотри не", "не"));
    }
}
