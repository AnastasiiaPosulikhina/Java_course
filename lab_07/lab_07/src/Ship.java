public class Ship {
    private String title;
    private String captainName;
    private int port;
    private char type;
    public void updateShipInfo() {
        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
    }
    public void updateShipInfo(String title, String captainName) {
        this.title = title;
        this.captainName = captainName;
        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
    }
    public void updateShipInfo(String title) {
        this.title = title;
        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
    }
    public void updateShipInfo(String title, String captainName, int port, char type) {
        this.title = title;
        this.captainName = captainName;
        this.port = port;
        this.type = type;
        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
    }
    public void updateShipInfo(String title, String captainName, int port) {
        this.title = title;
        this.captainName = captainName;
        this.port = port;
        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
    }
}