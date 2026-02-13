package src.java17;


public  sealed class shape permits Circle, Square
{


    private String hello;
    private String sample;



    public shape(String hello, String sample) {
        this.hello = hello;
        this.sample = sample;
    }

    public void parentMethod(){
        System.out.println("parent class: parent Method");
    }
}
