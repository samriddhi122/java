public class getDatatype {
    public static void main(String[] args) {
        Object a=12;
        Object b= 12.0;
        Object c='A';
        Object d=158728940;
        Object e="sampi";
        Object f=false;
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
        System.out.println(c.getClass().getSimpleName());
        System.out.println(d.getClass().getSimpleName());
        System.out.println(e.getClass().getSimpleName());
        System.out.println(f.getClass().getSimpleName());
    }
}
