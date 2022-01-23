package home_work_5.main;

import home_work_5.dto.RegExSearch;

public class Main2 {
    public static void main(String[] args) {
        RegExSearch findIndex=new RegExSearch();
        System.out.println( findIndex.search
                ("привет сколько я не видела тебя не смотри не", "не"));
    }
}
