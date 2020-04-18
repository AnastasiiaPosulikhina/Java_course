import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListCheck {
    /**
     * Метод выводит информацию о элементах контейнера deviceList
     *
     * Метод выполняется в {@link #main(String[])}
     *
     * @param deviceList - список объектов класса Device
     */
    static void printList(List<Device> deviceList) {
        for (Device device : deviceList) {
            System.out.println(device.getInfo());
        }
    }

    /**
     * Метод проверяет кратность идентификатора числу number у объекта device
     *
     * Метод выполняется в {@link #main(String[])}
     *
     * @param deviceList - контейнер, содержащий объекты класса Device
     * @param device - объект класса Device
     * @param number - число, которому должен быть кратен индентификатор элемента Device
     */
    static void checkElement(List<Device> deviceList, Device device, int number) {
        if (deviceList.contains(device)) {
            if (device.getId() % number == 0) {
                System.out.println("Идентификатор устройства кратен числу " + number + ".");
            }
        }
        else {
            System.out.println("Ошибка: устройства нет в списке deviceList!");
        }
    }

    static void printListWithIterator(List<Device> deviceList) {
        Iterator<Device> iterator = deviceList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getInfo());
        }
    }

    public static void main(String[] args) {
        List<Device> arrayDeviceList = new ArrayList<>();
        List<Device> linkedDeviceList = new LinkedList<>();
        for (int i = 1; i < 51; i++) {
            arrayDeviceList.add(new Device(i, i + 100));
            linkedDeviceList.add(new Device(i, i + 200));
        }
        printList(arrayDeviceList);
        Device device1 = arrayDeviceList.get(1);
        checkElement(arrayDeviceList, device1, 2);
        System.out.println("\n");
        printList(linkedDeviceList);
        Device device2 = linkedDeviceList.get(39);
        checkElement(linkedDeviceList, device2, 4);
        System.out.println("\n");
        printListWithIterator(arrayDeviceList);
    }
}

