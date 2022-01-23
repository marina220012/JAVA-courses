package home_work_5.dto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class WarAndPeace1 {
    public static void main(String[] args) {
        Set<String> data=new LinkedHashSet<>();
        data=fileOpen();
        System.out.println(data);
        System.out.println("количество слов "+data.size());

    }

    public static Set<String> fileOpen(){
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
        Set<String> data = new LinkedHashSet<>();
        try{
            int charFromFile;
            StringBuilder builder = new StringBuilder();
            while ((charFromFile =  reader.read()) != -1){//проходим по строке
                if(Character.isLetterOrDigit(charFromFile) /*&& charFromFile !=';'
                        && charFromFile!='.' && charFromFile!=','
                        && charFromFile!=':'*/ || charFromFile=='-'){
                    if(charFromFile=='-'){
                       charFromFile= reader.read();
                    }
                        builder.append((char)charFromFile);

                } else {
                    if(builder.length() > 0){
                        data.add(builder.toString());
                        builder.setLength(0);
                    }
                }
            }
            data.add(builder.toString());
        } catch (IOException e){
            System.out.println("Проблемы при чтении файла");
        }
        return data;
    }
}