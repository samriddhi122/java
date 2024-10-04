package assignment2;
/**
 * parent
 */
class parent {
    void display(){
        System.out.println("parent");
    }
    
}
class child extends parent{
    super.display();
    void display(){
        System.out.println("override");
    }

    @Override
    public String toString() {
        return "child []";
    }
}

public class test {
    public static void main(String[] args) {
        parent p=new parent();
        p.display();
        child c=new child();
        c.display();
    }
}
