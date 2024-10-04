public class parent {
    void run(){
        System.out.println("hi");
    }
};
class child extends parent{
    void run(){
        System.out.println("sam");
    }
public static void main(String args[]){
    parent p= new child();
    p.run();
}
};
