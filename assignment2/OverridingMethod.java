package assignment2;
interface A {
    public default void sum(int a,int b){
        int ans=a+b;
        System.out.println(ans);
    }
}

class B implements A {
    public void sum(int a,int b){
       int ans2=a+b+1;
       System.out.println(ans2);
    }
}
public class OverridingMethod {
   public static void main(String[] args) {
    A objB=new B();
    objB.sum(5, 9);
   }
    
}