public class Pounds extends MainAccount{
    public Pounds(String number, double limit, double currentfunds){
        super(number, limit, currentfunds);
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Текущие средства в фунтах.\n");
    }
}
