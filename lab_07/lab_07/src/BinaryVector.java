public class BinaryVector {
    public static void main(String[] args){
        int[] w = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //массив с данными
        int s = 6; //данная сумма
        int n = w.length; //количество элементов в последовательности w
        String x = new String(); //бинарный вектор
        int i = 0;
        int s1 = 0; //искомая сумма
        BinaryVectorCalculation(w, i, n, x, s, s1);
    };
    static void BinaryVectorCalculation(int[] w, int i, int n, String x, int s, int s1){
        if (i == n){
            if (s1 == s) System.out.println("x = " + x);
        }
        else{
            i++;
            BinaryVectorCalculation(w, i, n, x+"0",s,s1);
            BinaryVectorCalculation(w, i, n, x+"1",s,s1+w[i-1]);
        }
    }
}
