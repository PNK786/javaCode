package src.collections.ObjectCreations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

class Forest implements Serializable
{
    String name;

    Forest(String name){
        this.name=name;

    }
}
public class ObjectInputStream
{

    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("data.txt")) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
