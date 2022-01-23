package home_work_5.main;

import home_work_5.dto.SearchEngineWithoutCase;

public class Main3 {
    public static void main(String[] args) {
        SearchEngineWithoutCase findWords=new SearchEngineWithoutCase();
        System.out.println( findWords.search
                ("привет сколько я Не видела тебя не смотри не","не"));
    }
}
