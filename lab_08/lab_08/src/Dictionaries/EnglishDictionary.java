package Dictionaries;
import java.util.HashMap;
import java.util.Map;
public class EnglishDictionary implements Dictionary {
    Map<String, String> glossary = new HashMap<String, String>();
    final private String lang = "English";
    public EnglishDictionary() {
        glossary.put("I", "Я");
        glossary.put("eat", "ем");
        glossary.put("porridge", "кашу");
        glossary.put("and", "и");
        glossary.put("eggs", "яйца");
        glossary.put("for", "на");
        glossary.put("breakfast.", "завтрак.");
    }
    @Override
    public String getTranslation(String word) {
        return glossary.get(word);
    }
    @Override
    public boolean findWord(String word) {
        if (glossary.containsKey(word)) {
            System.out.println("Слово найдено в " + lang + "Dictionary.");
            return true;
        } else {return false;}
    }
}

