package Dictionaries;
public class EnglishDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new EnglishDictionary();
    }
}
