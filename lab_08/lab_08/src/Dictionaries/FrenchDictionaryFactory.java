package Dictionaries;
public class FrenchDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new FrenchDictionary();
    }
}
