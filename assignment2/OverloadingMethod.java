package assignment2;
public class OverloadingMethod {
    
    public void sum(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public void sum(int a,int b,int m){
        int c=a+b+m;
        System.out.println(c);
    }
    public void sum(int a,double b){
        double c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        OverloadingMethod objTask=new OverloadingMethod();
        objTask.sum(5, 6);
        objTask.sum(3,7,9);
        objTask.sum(4,6.3);
    }
}
