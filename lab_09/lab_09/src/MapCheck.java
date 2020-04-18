import java.util.*;

public class MapCheck {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2001, Calendar.AUGUST, 14);
        students.add(new Person("Полухина", "Анастасия", "Данииловна", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2000, Calendar.APRIL, 28);
        students.add(new Person("Соколова", "Анна", "Александровна", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2001, Calendar.JANUARY, 2);
        students.add(new Person("Котенёв", "Сергей", "Сергеевич", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(1999, Calendar.AUGUST, 9);
        students.add(new Person("Кудинов", "Денис", "Андреевич", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(1999, Calendar.OCTOBER, 11);
        students.add(new Person("Караулов", "Максим", "Анатольевич", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(1999, Calendar.DECEMBER, 21);
        students.add(new Person("Цукаров", "Андрей", "Борисович", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2001, Calendar.JUNE, 15);
        students.add(new Person("Аделова", "Маргарита", "Дмитриевна", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2000, Calendar.JANUARY, 5);
        students.add(new Person("Борзёнов", "Артём", "Эдуардович", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2000, Calendar.FEBRUARY, 20);
        students.add(new Person("Королева", "Анастасия", "Романовна", calendar));

        Map<Integer, ArrayList<Person>> hashMap = new HashMap<>();
        Map<Integer, ArrayList<Person>> treeMap = new TreeMap<>();
        Map<Integer, ArrayList<Person>> linkedHashMap = new LinkedHashMap<>();

        hashMap = setMap(students, hashMap);
        treeMap = setMap(students, treeMap);
        linkedHashMap = setMap(students, linkedHashMap);

        compareMaps(hashMap, treeMap, linkedHashMap);
    }

    public static Map setMap(List<Person> personList, Map<Integer, ArrayList<Person>> personMap) {
        for (Person person : personList) {
            int year = person.getBirthday().get(Calendar.YEAR);
            if (personMap.containsKey(year)) {
                ArrayList<Person> people = personMap.get(year);
                people.add(person);
                personMap.put(year, people);
            } else {
                ArrayList<Person> people = new ArrayList<>();
                people.add(person);
                personMap.put(year, people);
            }
        }
        return personMap;
    }

    public static void compareMaps(Map<Integer, ArrayList<Person>> hashMap, Map<Integer, ArrayList<Person>> treeMap, Map<Integer, ArrayList<Person>> linkedHashMap) {
        System.out.println("HashMap\t\t\t\t| TreeMap\t\t\t| LinkedHashMap");
        ArrayList<ArrayList<Person>> hashArray = new ArrayList(hashMap.values()); //получение массивов со значениями Map
        ArrayList<ArrayList<Person>> treeArray = new ArrayList(treeMap.values());
        ArrayList<ArrayList<Person>> linkedHashArray = new ArrayList(linkedHashMap.values());
        for (int i = 0; i < hashArray.size(); i++) {
            for (int j = 0; j < hashArray.get(i).size(); j++) {
                System.out.println(hashArray.get(i).get(j).getFIO() + "\t\t| " + treeArray.get(i).get(j).getFIO() + "\t\t| " + linkedHashArray.get(i).get(j).getFIO());
            }
        }
    }
}
