// sum of numbers in a given range
public class five {
    public static void main(String[] args) {
        int a = 5,b=10;
        int sum = 0;
        for (int i = a; i <= b; i++)
        sum = sum + i;
      System.out.println ("The sum is " + sum);
        
        //using for loop
        /*for(int i = a;i<b;i++){
            sum = sum +i;
        }
        System.out.println("the sum of numbers in range: "+sum);*/
        //using formula
        int sums = (b*(b+1)/2) - (a*(a+1)/2) + a;
        System.out.println("sum is :"+sums);
        

    }
}
