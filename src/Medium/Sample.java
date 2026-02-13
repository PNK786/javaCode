package src.Medium;

class Base{
    public static void display(){
        System.out.println("Base");
    }
}

class Derived extends Base
{

    public  static void display() {
        System.out.println("derived");
    }
}


public class Sample {
    public static void main(String[] args) {
        Base base= new Derived();
        base.display();
    }
}
