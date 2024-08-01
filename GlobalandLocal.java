public class GlobalandLocal {
    static int a=9;
    static float f=15;
    int c=0;
    static{
        System.out.println(f);
    }
    public static void main(String[] args) {
        int c=15;
        int d=10;
        d=a+c;
        System.out.println(d);
    }
    static{
        System.out.println(a);
    }
    
}
