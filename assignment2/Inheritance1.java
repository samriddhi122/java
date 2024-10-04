package assignment2;
class Computer extends Inheritance1 {
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
public class Inheritance1 {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.speed();
    }
}
