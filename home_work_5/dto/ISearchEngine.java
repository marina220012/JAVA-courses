package home_work_5.dto;

public interface ISearchEngine {
    //Метод возвращает информации о количестве раз,
    // которое встречается слово в тексте.
    // Первый параметр текст в котором ищем,
    // второй параметр что ищем в тексте.
    public long search(String text, String word);
}
