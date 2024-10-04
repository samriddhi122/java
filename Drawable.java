public interface Drawable {
    abstract void darw();
}
class Rectangle implements Drawable{
    public void darw(){
        System.out.println("drawing rectangle");
    }
}
class Circle implements Drawable{
    public void darw(){
        System.out.println("drawing circle");
    }
}
class testInterface{
    public static void main(String[] args) {
        Drawable d=new Circle();
        d.darw();
    }
}
