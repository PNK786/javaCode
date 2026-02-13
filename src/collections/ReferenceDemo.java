package src.collections;

class Account {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }
}
public class ReferenceDemo {

    static void update(Account acc) {
        acc.balance = 500;
        acc = new Account(1000);
    }
    public static void main(String[] args) {
        Account a1 = new Account(100);
        update(a1);
        System.out.println(a1.balance);
    }
}
