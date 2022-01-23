package home_work_5.dto;

import java.io.IOException;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    public String deleteSymbols(String text){
        StringBuilder newString=new StringBuilder();
        for (int i=0; i<text.length(); i++){
            if(Character.isLetterOrDigit(text.charAt(i)) || Character.isDefined(' ')){//добавить два рпобела подряд
                newString.append(text.charAt(i));
            }
        }


     return newString.toString();
    }
    @Override
    public long search(String text, String word) {
        return 0;
    }
}
