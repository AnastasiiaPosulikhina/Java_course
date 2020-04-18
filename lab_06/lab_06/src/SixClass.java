public class SixClass {
    static HanoiTower[] stacks = new HanoiTower[3];
    static int n = 5;
    public static void main(String[] args) {
        stacks[0] = new HanoiTower(n, n); //создание первого стержня, заполненного n дисками
        stacks[1] = new HanoiTower(0, n); //создание 2 и 3 пустых стержнеё
        stacks[2] = new HanoiTower(0, n);
        for (int i = 0; i < n; i++) { //установка дисков на первом стержне
            stacks[0].setDisk(i, n - i);
            stacks[1].setDisk(i, 0);
            stacks[2].setDisk(i, 0);
        }
        moveStack(n, 0, 2); //перемещение диска с n с первого стержня на третий
    }
    static void moveStack(int size, int fromStack, int toStack) { //перемещение диска с одного стержня на другой size - кол-во колец на стержне
        if (size == 0) {
            return; //выход из метода, если стержень 1 уже пустой
        }
        int i3 = geti3(fromStack, toStack); //получение индекса пустого стержня
        moveStack(size - 1, fromStack, i3); //перемещение(меньше на 1) диска на третью башню
        stacks[fromStack].moveDisk(stacks[toStack]); //перемещение самого большого диска
        System.out.println("Перемещение диска с " + (fromStack + 1) + " стержня на " + (toStack + 1) + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("|" + stacks[0].getDisk(n - i - 1) + "|\t|" + stacks[1].getDisk(n - i - 1) + "|\t|" + stacks[2].getDisk(n - i - 1) + "|");
        }
        System.out.println("\n");
        moveStack(size - 1, i3, toStack); //возвращение диска с третьего стержня на стержень с самым большим диском
    }
    static int geti3(int i1, int i2) { //получение индекса пустого стержня
        switch (i1) {
            case 0:
                if (i2 == 1) {
                    return 2;
                } else {
                    return 1;
                }
            case 1:
                if (i2 == 0) {
                    return 2;
                } else {
                    return 0;
                }
            case 2:
                if (i2 == 0) {
                    return 1;
                } else {
                    return 0;
                }
        }
        return 0;
    }
}