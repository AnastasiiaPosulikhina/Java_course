package Dictionaries;
import java.util.HashMap;
import java.util.Map;
public class FrenchDictionary implements Dictionary {
    Map<String, String> glossary = new HashMap<String, String>();
    final private String lang = "French";
    public FrenchDictionary() {
        glossary.put("Je", "Я");
        glossary.put("mange", "ем");
        glossary.put("la", "");
        glossary.put("bouillie", "кашу");
        glossary.put("et", "и");
        glossary.put("les", "");
        glossary.put("oeufs", "яйца");
        glossary.put("au", "на");
        glossary.put("petit", "");
        glossary.put("dejeuner.", "завтрак.");
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

