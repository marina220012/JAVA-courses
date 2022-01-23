package home_work_5.dto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarAndPeace2 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> data=new HashMap<>();
        data=fileOpen();
       // System.out.println(data);
        System.out.println("количество слов "+data.size());

        List<Map.Entry<String, Integer>> arr = new ArrayList<>();
        arr=data.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).toList();
        for (int i=0; i<10; i++){
            System.out.println(arr.get(i));
        }

    }

    public static Map<String, Integer> fileOpen(){
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


        Map<String, Integer> data = new HashMap<>();

        try{
            int charFromFile;
            StringBuilder builder = new StringBuilder();
            while ((charFromFile =  reader.read()) != -1){
                if(Character.isLetterOrDigit(charFromFile)|| Character.isDigit(charFromFile)/* && charFromFile !=';'
                        && charFromFile!='.' && charFromFile!=','
                        && charFromFile!=':' */|| charFromFile=='-'){
                    if(charFromFile=='-'){
                        charFromFile= reader.read();
                    }
                    builder.append((char)charFromFile);

                } else {
                    if(builder.length() > 0 &&
                            !data.containsKey(builder.toString())){
                        data.put(builder.toString(), 1);
                        builder.setLength(0);
                    }else {
                        if (builder.length() > 0 &&
                                data.containsKey(builder.toString())){
                            data.put(builder.toString(), data.get(builder.toString())+1);
                            builder.setLength(0);

                        }
                    }
                }
            }
            if(builder.length() > 0 &&
                    !data.containsKey(builder.toString())){
                data.put(builder.toString(), 1);
                builder.setLength(0);
            }else {
                if (builder.length() > 0 &&
                        data.containsKey(builder.toString())){
                    data.put(builder.toString(), data.get(builder.toString())+1);
                    builder.setLength(0);

                }
            }
        } catch (IOException e){
            System.out.println("Проблемы при чтении файла");
        }
        return data;
    }

}