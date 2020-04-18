import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public class MaxMinAnalysis implements Runnable {
    @Override
    public void run() {
        synchronized (AnalysisCheck.frequency) { //запрет выполнения опред. метода, выполняющегося другим потоком
            if (AnalysisCheck.frequency.isEmpty()) {
                System.out.println("Карта пуста! Введите текст документа.");
            } else {
                int i = 0;
                Map<Character, Integer> check = (LinkedHashMap) ((LinkedHashMap<Character, Integer>) AnalysisCheck.frequency).clone(); //временный контейнер т.к. происходят изменения
                System.out.println("Три наименее встречающихся в тексте символа:");
                while (i < 3) { //наименее встречающиеся символы
                    int min = Collections.min(check.values());
                    for (Map.Entry<Character, Integer> entry : check.entrySet()) {
                        if (entry.getValue() == min) {
                            System.out.println(entry);
                            entry.setValue(Integer.MAX_VALUE);
                            if (++i == 3) {
                                break;
                            }
                        }
                    }
                }
                i = 0;
                check = (LinkedHashMap) ((LinkedHashMap<Character, Integer>) AnalysisCheck.frequency).clone(); //копия карты т.к. в ней происходят изменения
                System.out.println("Три наиболее встречающихся в тексте символа:");
                while (i < 3) { //наиболее встречающиеся символы
                    int max = Collections.max(check.values());
                    for (Map.Entry<Character, Integer> entry : check.entrySet()) {
                        if (entry.getValue() == max) {
                            System.out.println(entry);
                            entry.setValue(Integer.MIN_VALUE);
                            if (++i == 3) {
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("Окончание работы с документом.");
        }
    }
}