package Computer;
public class ComputerMouse implements InputDevices {
    @Override
    public void IsDeviceConnected(Boolean connection) {
        if (connection == true){
        System.out.println("Устройство подкючено к компьютеру.");
    }
    else{
        System.out.println("Устройство не подкючено к компьютеру.");
    }
    }
    public void mouseType(Boolean type){
        if (type == true){
            System.out.println("Компьютерная мышь подключена через провод.");
        }
        else{
            System.out.println("Компьютерная мышь беспроводная.");
        }
    }
}



