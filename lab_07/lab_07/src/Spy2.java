public class Spy2 {
    public static void main(String[] args) {
        Spy a = new Spy();
        a.setName("Борис Васютко");
        a.setRealName("Александр Абрамов");
        a.setSquad(23);
        a.print();
        System.out.println("Имя (функция getName()): " + a.getName());
        System.out.println("Настоящее имя (функция getRealName()): " + a.getRealName());
        System.out.println("Отряд (функция getSquad()): " + a.getSquad());
    }
}
