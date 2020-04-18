package Dictionaries;
import java.util.HashMap;
import java.util.Map;
public class GermanDictionary implements Dictionary {
    Map<String, String> glossary = new HashMap<String, String>();
    final private String lang = "German";
    public GermanDictionary() {
        glossary.put("Ich", "Я");
        glossary.put("esse", "ем");
        glossary.put("Brei", "кашу");
        glossary.put("und", "и");
        glossary.put("Eier.", "яйца.");
        glossary.put("zum", "на");
        glossary.put("Frühstück", "завтрак");
    }
    @Override
    public boolean findWord(String word) {
        if (glossary.containsKey(word)) {
            System.out.println("Слово найдено в " + lang + "Dictionary.");
            return true;
        } else {return false;}
    }
    @Override
    public String getTranslation(String word) {
        return glossary.get(word);
    }
}

