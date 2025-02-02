package src.java8;


public class primeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(12));

    }

    public static boolean isPrime(int Num) {
        boolean flag = true;
        if (Num == 0 || Num == 1) {
            System.out.println("please enter number more than 1");
        } else {
            for (int i = 2; i <= Num / 2; ++i) {
                if (Num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
