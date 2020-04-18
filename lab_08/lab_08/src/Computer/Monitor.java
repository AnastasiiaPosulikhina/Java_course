package Computer;
public class Monitor implements OutputDevices {
    @Override
    public void informationOutput(String info) {
        System.out.println("Информация на экране монитора: " + info);
    }
    public void size(String size) {
        System.out.println("Разрешение экрана монитора: " + size);
    }
}





