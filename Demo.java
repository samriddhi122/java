import java.util.Scanner;
class Commission{
    int sales;
    Commission(int sales){
        this.sales=sales;
    }
    int commission(int sales){
        return sales+=sales*0.1;
    }
}
public class Demo{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
       System.out.println("enter sales");
       int input=scanner.nextInt();
       Commission comm=new Commission(input);
       
       if(input>0){
            comm.commission(input);
            System.out.println(comm);
       }
       else{
        System.out.println("Invalid Input");
       }


        
    }
}