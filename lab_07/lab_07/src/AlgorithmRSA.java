import java.math.BigInteger;
public class AlgorithmRSA {
    public static void main(String[] args){
        int p = 43;
        int q = 61;
        BigInteger n = BigInteger.valueOf(p*q); //произведение, которое не может быть разложено за опред. время
        int k = (p - 1)*(q - 1); //вычисление значения функции Эйлера
        BigInteger e = new BigInteger("1"); //открытая экспонента - взаимно простое число с функцией Эйлера
        for (int i = 3; i < k; i++) { //поиск открытой экспоненты
            if (NOD(i) && BigInteger.valueOf(i).gcd(BigInteger.valueOf(k)).equals(BigInteger.ONE)) {
                e = BigInteger.valueOf(i);
            }
        }
        System.out.println("Открытый ключ системы RSA:\ne = " + e + "\nn = " + n);
        BigInteger d = e.modInverse(BigInteger.valueOf(k)); //закрытый ключ, удовлетворяющий усл.: (d*e) mod k == 1
        System.out.println("Закрытый ключ системы RSA:\nd = " + d + "\nn = " + n);
        BigInteger encode = new BigInteger("1234");
        encode = encode.modPow(e, n);
        System.out.println("Засшифрованное сообщение: " + encode);
        BigInteger decode = encode.modPow(d,n);
        System.out.println("Расшифрованное сообщение: " + decode);
    }
    static boolean NOD(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
