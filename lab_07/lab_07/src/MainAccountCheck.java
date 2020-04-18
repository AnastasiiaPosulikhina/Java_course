
public class MainAccountCheck {
    public static void main(String[] args) {
        MainAccount.getName("Посулихина Анастасия Данииловна");
        Rubles rubAcc = new Rubles("1.1", 1000000,351745);
        Pounds poundAcc = new Pounds("1.2", 150000, 100350);
        rubAcc.print();
        rubAcc.takeoutMoney(100000);
        rubAcc.print();
        rubAcc.putMoney(5000000);
        poundAcc.print();
        poundAcc.putMoney(1000);
        poundAcc.print();
        poundAcc.takeoutMoney(110000);
    }
}
