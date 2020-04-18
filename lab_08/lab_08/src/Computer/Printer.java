package Computer;
public class Printer implements OutputDevices {
    @Override
    public void informationOutput(String text) {
        System.out.println("Текст для печати на принтере: " + text);
    }
    public void printerModel(String model) {
        System.out.println("Модель принтера: " + model);
    }
}





