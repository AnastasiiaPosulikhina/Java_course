package Dictionaries;
import java.util.HashMap;
import java.util.Map;

public class GermanDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new GermanDictionary();
    }
}