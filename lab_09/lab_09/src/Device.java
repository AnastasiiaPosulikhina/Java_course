public class Device {
    private int id;
    private int capacity;

    public Device(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return "Идентификатор устройства: " + this.id + "; ёмкость устройства: " + this.capacity + ";";
    }
}