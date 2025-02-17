import java.util.Scanner ;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
       /*  int sum = (num*(num+1))/2;
        System.out.println("the sum of "+num+" natural numbers is : "+sum);*/
        //using for loop
        int sum = 0;

        for(int i=1;i<=num;i++){
         sum = sum+i;
        }
        System.out.println("the sum of "+num +" natural numbers is "+sum);  

    }
}
