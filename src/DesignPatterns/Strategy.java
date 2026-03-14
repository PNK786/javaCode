package src.DesignPatterns;

interface  DiscountStrategy
{
    double applyDiscount(double price);
}

class NoDiscount implements DiscountStrategy
{

    @Override
    public double applyDiscount(double price) {
        return price;
    }
}

class  newUser implements DiscountStrategy
{
    @Override
    public double applyDiscount(double price) {
        return price*0.8;
    }
}

class FestivalDiscount implements DiscountStrategy
{

    @Override
    public double applyDiscount(double price) {
        return 0.9;
    }
}

class Checkout
{
    private DiscountStrategy strategy;

    public Checkout(DiscountStrategy strategy)
    {
        this.strategy=strategy;
    }

    public double CalculateFinalPrice(double price)
    {
        return strategy.applyDiscount(price);
    }

}
public class Strategy
{
    public static void main(String[] args) {
      Checkout checkout=  new Checkout(new FestivalDiscount());

        System.out.println("final price: "+ checkout.CalculateFinalPrice(10000));
    }

}
