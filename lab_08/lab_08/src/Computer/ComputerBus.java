package Computer;
public class ComputerBus implements DataProcessing {
    public void getBusType(String type) {
        System.out.println("Тип шины: " + type);
    }
    @Override
    public void moving(HDD hdd, Monitor monitor) {
        if (hdd.getInfo().isEmpty()) {
            System.out.println("Жёсткий диск пуст!");
        } else {
            System.out.println("Информация передана с жёсткого диска на монитор:");
            monitor.informationOutput(hdd.getInfo());
        }
    }
    @Override
    public void moving(MainMemory memory, Monitor monitor) {
        if (memory.getInfo().isEmpty()) {
            System.out.println("Жёсткий диск пуст!");
        } else {
            System.out.println("Информация передана с основной памяти на монитор:");
            monitor.informationOutput(memory.getInfo());
        }
    }
}
