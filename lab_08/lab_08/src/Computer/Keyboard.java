package Computer;
public class Keyboard implements InputDevices {
    private boolean layout;
    @Override
    public void IsDeviceConnected(Boolean connection) {
        if (connection == true){
            System.out.println("Устройство подкючено к компьютеру.");
        }
        else{
            System.out.println("Устройство не подкючено к компьютеру.");
        }
    }
    public void layout(String layout){
        if (layout == "rus"){
            System.out.println("Включена русская раскладка клавиатуры.");
        }
        else{
            System.out.println("Включена английская раскладка клавиатуры.");
        }
    }
}






