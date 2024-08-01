public class Prime {
    public static void main(String[] args) {
        int a=105;
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("not a prime number!");
                break;
            }
            else{
                System.out.println("it's a prime number");
            }   
        }
        
        
    }
}
