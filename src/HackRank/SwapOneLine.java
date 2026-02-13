package src.HackRank;

public class SwapOneLine
{
    public static void main(String[] args) {
        int a=5;
        int b=10;

        System.out.println("A "+a);
        System.out.println("B "+b);

        a=(a+b)-(b=a);
        System.out.println("A "+a);
        System.out.println("B "+b);
    }
}
