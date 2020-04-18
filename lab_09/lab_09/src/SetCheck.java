import java.util.*;
import java.util.stream.Collectors;

public class SetCheck {
    public static void setFromString(String text, Set stringSet) { //составление контейнера, заполнение контейнера stringSet
        stringSet.addAll(Arrays.asList(text.split(" ")));
    }

    public static void printSet(Set set) { //поэлементный вывод информации об объектах контейнера
        Iterator iter = set.iterator();
        int i = 0;
        while (iter.hasNext()) {
            if (i == 15) {
                i = 0;
                System.out.println();
            }
            System.out.print(iter.next() + " ");
            i++;
        }
        System.out.println("\n");
    }

    public static Set union(Set<String> set1, Set<String> set2) { //объединение множеств
        Set res = set1.stream().collect(Collectors.toSet());     //Эта конструкция позволяет решить проблему с ссылкой на объект
        res.addAll(set2);                                        //в main. В Java объект передаётся по ссылке(это не совсем так, но для понимания пойдёт)
        return res;                                              //Если присвоить напрямую, то все изменения отразятся на Set в основном методе
    }

    public static Set intersection(Set<String> set1, Set<String> set2) { //пересечение множеств
        Set res = set1.stream().collect(Collectors.toSet());
        res.retainAll(set2);
        return res;
    }

    public static Set subtraction(Set<String> set1, Set<String> set2) { //разность множеств
        Set intersection = set1.stream().collect(Collectors.toSet());
        intersection.retainAll(set2);

        Set res = set1.stream().collect(Collectors.toSet());
        res.addAll(set2);
        res.removeAll(intersection);
        return res;
    }

    public static void main(String[] args) {
        Set<String> hashSet1 = new HashSet<>();
        Set<String> hashSet2 = new HashSet<>();
        Set<String> treeSet1 = new TreeSet<>();
        Set<String> treeSet2 = new TreeSet<>();
        Set<String> linkedHashSet1 = new LinkedHashSet<>();
        Set<String> linkedHashSet2 = new LinkedHashSet<>();
        String text = "A computer's memory can be viewed as a list of cells into which numbers can be placed or read. Each cell has a numbered address and can store a single number. The computer can be instructed to put the number 123 into the cell numbered 1357 or to add the number that is in cell 1357 to the number that is in cell 2468 and put the answer into cell 1595.";
        setFromString(text, hashSet1);
        setFromString(text, treeSet1);
        setFromString(text, linkedHashSet1);
        setFromString("Each cell has a numbered address and can store one number.", hashSet2);
        setFromString("The computer can be instructed to put the number 555...", treeSet2);
        setFromString("A computer's memory can be viewed as a collection...", linkedHashSet2);

        System.out.println("Объединение множеств:\n");
        printSet(union(hashSet1, hashSet2));
        printSet(union(treeSet1, treeSet2));
        printSet(union(linkedHashSet1, linkedHashSet2));

        System.out.println("Пересечение множеств:\n");
        printSet(intersection(hashSet1, hashSet2));
        printSet(intersection(treeSet1, treeSet2));
        printSet(intersection(linkedHashSet1, linkedHashSet2));

        System.out.println("Разность множеств:\n");
        printSet(subtraction(hashSet1, hashSet2));
        printSet(subtraction(treeSet1, treeSet2));
        printSet(subtraction(linkedHashSet1, linkedHashSet2));
    }
}
