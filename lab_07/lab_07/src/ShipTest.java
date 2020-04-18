public class ShipTest {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        ship1.updateShipInfo();
        ship1.updateShipInfo("Avrora", "Nemo A.A.");
        ship1.updateShipInfo("Wolf");
        ship1.updateShipInfo("Wave", "Borisov B.B.", 3, 'A');
        ship1.updateShipInfo("Breath", "Vasonov D.A.", 7);
    }
}