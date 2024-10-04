package assignment2;

public class Computer extends Inheritance1 {
    public void display(){
        int display=120;
        System.out.println("Display of computer is :"+display+"Hz");
    }
    public void speed(){
        int speed=3;
        System.out.println("speed of comp is:"+speed+"GHz" );
    }
}
class Laptop extends Computer{
    public void weight(){
        System.out.println("portable");
    }
}