public class OverloadExample {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        Plant p2 = new Plant("tulip", "red");
        Plant p3 = new Plant("cactus");
        Plant p4 = new Plant("chamomile","white","Eurasia");
        Plant p5 = new Plant("rose", "red",false);
        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();
    }
}