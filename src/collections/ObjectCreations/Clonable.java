package src.collections.ObjectCreations;

class Animal implements Cloneable{
    String name="Cheeta";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Clonable
{
    public static void main(String[] args) throws CloneNotSupportedException {

        Animal a3= new Animal();
        Animal a4= (Animal) a3.clone();

        System.out.println(a4.name);
    }
}
