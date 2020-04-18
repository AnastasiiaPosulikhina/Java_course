package Dictionaries;
public class DictionaryCheck {
    public static void main(String[] args) {
        // String doc = "Je mange de la bouillie et les oeufs au petit dejeuner.";
        // String doc = "I eat porridge and eggs for breakfast.";
        //String doc = "Ich esse zum Frühstück Brei und Eier.";
        String doc = "Ich esse zum Frühstück Brei und Eier.";
        String lang = "german";
        DictionaryFactory df = createFactory(lang);
        Dictionary dict = df.getDictionary();
        System.out.println(translateDocument(doc, dict));
    }
    private static String translateDocument(String doc, Dictionary dict) {
        String[] text = doc.split(" ");
        String newdoc = "";
        for (String word : text) {
            if (dict.findWord(word)) {
                newdoc += dict.getTranslation(word) + " ";
            } else {
                newdoc += word + " ";
            }
        }
        return newdoc;
    }
    private static DictionaryFactory createFactory(String lang) {
        lang = lang.toLowerCase();
        switch (lang) {
            case "english":
                return new EnglishDictionaryFactory();
            case "german":
                return new GermanDictionaryFactory();
            case "french":
                return new FrenchDictionaryFactory();
            default:
                throw new RuntimeException("Программа не знает этот язык!");
        }
    }
}
