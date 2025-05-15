package src.collections.ObjectCreations;

import java.lang.reflect.Constructor;

class ReflectionDemo {


    public ReflectionDemo(){
        System.out.println("Constructor Invoked");
    }

}

public class WaysOfCreationObject
{

    public static void main(String[] args)  {
       try {
           Constructor<ReflectionDemo> constructor = ReflectionDemo.class.getConstructor();
           ReflectionDemo obj = constructor.newInstance();
       }catch (Exception ex)
       {
           ex.printStackTrace();
       }
       }
}
