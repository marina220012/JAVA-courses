package home_work_5.dto;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        int index=0, count=0;
        while (index< text.length()){
            if(text.indexOf(word,index)==-1){
                return count;
            }
            index=text.indexOf(word, index)+word.length()+1;
            count++;
        }
        return count;
    }
}
