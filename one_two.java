import java.util.Scanner;
public class one_two{
    public static void main(String[] args) {
       System.out.println("enter a no.: "); 
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       if (num<0){
        System.out.println("no is negative");
       }else if(num>0){
            System.out.println("no. is positive");
       }else{
        System.out.println("no is zero");
       }
    }
}