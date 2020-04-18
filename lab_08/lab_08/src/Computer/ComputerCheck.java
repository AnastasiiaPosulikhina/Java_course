package Computer;
public class ComputerCheck {
    public static void main(String[] args) {
        HDD hdd = new HDD();
        hdd.setInfo("Музыкальный альбом 'Ветром стать'.");
        System.out.println("Информация на жёстком диске: " + hdd.getInfo());
        hdd.capacity("2 ТБ");

        MainMemory memory = new MainMemory();
        memory.setInfo("Фильм 'Вся правда о кошках и собаках'.");
        System.out.println("Информация на основной памяти: " + memory.getInfo());
        memory.RAMtype("DDR3");

        Monitor monitor = new Monitor();
        monitor.informationOutput("Информатика - мой любимый предмет!");
        monitor.size("1280 x 1024");

        Printer printer = new Printer();
        printer.informationOutput("Компьютер состоит из таких устройств, как центральный процессор, основная память, шина, клавиатура, мышь, принтер, жесткий диск, монитор.");
        printer.printerModel("Pantum P2500W");

        Keyboard keyboard = new Keyboard();
        keyboard.IsDeviceConnected(true);
        keyboard.layout("rus");

        ComputerMouse mouse = new ComputerMouse();
        mouse.IsDeviceConnected(true);
        mouse.mouseType(true);

        ComputerBus cb = new ComputerBus();
        cb.moving(hdd, monitor);
        cb.getBusType("параллельная");

        CentralProcessor processor = new CentralProcessor();
        processor.moving(memory, monitor);
        processor.setProcessorCapacity(64);
        System.out.println("Разрядность центрального процессора: " + processor.getProcessorCapacity() + " бит.");
    }
}




