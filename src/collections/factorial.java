package src.collections;

public class factorial
{
    public static  int fact(int num)
    {
        int nu=1;
       for(int i =num;i>0;i--)
        {
            nu*=i;
        }
        return nu;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
