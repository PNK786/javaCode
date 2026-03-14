package src.DesignPatterns;


interface Payment {
    void pay(double amount);
}

class CreditcardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("payment done using credit card" + amount);
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("payment done using UPI" + amount);
    }
}

class PaymentFactory {
    public static Payment getPaymentMethods(String type) {
        if ("UPI".equalsIgnoreCase(type)) {
            return new UpiPayment();
        } else if ("CreditCard".equalsIgnoreCase(type)) {
            return new CreditcardPayment();
        }
        throw new IllegalArgumentException("Unknown payment type");
    }
}

public class Factory {

    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPaymentMethods("UPI");
             payment.pay(2897);
    }
}
