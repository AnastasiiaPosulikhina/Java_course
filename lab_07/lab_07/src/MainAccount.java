public class MainAccount {
    static String name;
    private String number;
    private double limit;
    private double currentfunds;
    public MainAccount(String number, double limit, double currentfunds){
        this.number = number;
        this.limit = limit;
        this.currentfunds = currentfunds;
    }
    public static void getName(String name){
        MainAccount.name = name;
    }
    public void putMoney(double money){
        if((money + this.currentfunds) > this.limit){
            System.out.println("Ошибка: превышение лимита счета!\n");
        }else{
            this.currentfunds+=money;
        }
    }
    public void takeoutMoney(double money){
        if (money > this.currentfunds){
            System.out.println("Ошибка: на счете недостаточно средств!\n");
        }else{
            this.currentfunds -= money;
        }
    }
    public void print(){
        System.out.println("Имя владельца счетов: " + this.name+"\nНомер счета: " + this.number + "\nЛимит счета: " + this.limit + "\nТекущие средства: " + this.currentfunds);
    }

}
