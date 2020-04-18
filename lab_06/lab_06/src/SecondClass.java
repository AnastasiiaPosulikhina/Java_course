public class SecondClass {
    public static void main(String[] args) {
        String s = "13.7";
        Double a = new Double(s);
        char c = "qwe".charAt(2); // символ со 2-й позиции
        System.out.println(a);
        System.out.println(c);
        Integer iS = new Integer("135");
        System.out.println(iS);
        iS = Integer.parseInt("135");
        System.out.println(iS);
        char s1 = "Java is one of the best languages!".charAt(5);
        String s11 = "Java is one of the best languages!";
        System.out.println("s1 = " + s1);
        System.out.println("Сравнение строк: " + s11.equals("Java is one of the most beautiful languages!"));
        System.out.println("Индекс вхождения подстроки best в строку s1: "  + s11.indexOf("best"));
    }
}
