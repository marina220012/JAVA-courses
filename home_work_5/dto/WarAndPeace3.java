package home_work_5.dto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class WarAndPeace3 {
    public static void main(String[] args) throws FileNotFoundException {
        String data;
        data=fileOpen();
       // System.out.println(data);
        //System.out.println("количество слов "+data.size());

        SearchEngineWithoutCase findWords=new SearchEngineWithoutCase();
        System.out.println( "Война встречается "+findWords.search
                (data,"война")+" раз");

        System.out.println( "и встречается "+findWords.search
                (data,"и")+" раз");

        System.out.println( "мир встречается "+findWords.search
                (data,"мир")+" раз");

    }

    public static String fileOpen(){
        Scanner console = new Scanner(System.in);

        BufferedReader reader = null;
        boolean opened;
        do {
            opened = true;

            System.out.println("Введите адрес файла");
            String filePath = console.nextLine();
            Path pathToFile = Path.of(filePath);

            try {
                reader = new BufferedReader(
                        new FileReader(pathToFile.toFile())
                );
            } catch (FileNotFoundException e) {
                System.out.println("Ввели неверный адрес");
                opened = false;
            }
        } while (!opened);


        try{
            int charFromFile;
            StringBuilder builder = new StringBuilder();
            while ((charFromFile =  reader.read()) != -1){
                    if(charFromFile=='-'){
                        charFromFile= reader.read();
                    }
                    builder.append((char)charFromFile);
            }
            return builder.toString();

        } catch (IOException e){
            System.out.println("Проблемы при чтении файла");
        }
        return null;
    }

}