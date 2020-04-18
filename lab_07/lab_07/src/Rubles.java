public class Rubles extends MainAccount{
    public Rubles(String number, double limit, double currentfunds){
        super(number, limit, currentfunds);
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Текущие средства в рублях.\n");
    }
}
