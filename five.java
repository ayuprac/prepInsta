// sum of numbers in a given range
public class five {
    public static void main(String[] args) {
        int a = 5,b=10;
        
        
        //using for loop
        
        /*
        int sum = 0;
        for(int i = a;i<=b;i++){
            sum = sum +i;
        }
        System.out.println("the sum of numbers in range: "+sum);*/
        //using formula
       /*  int sums = (b*(b+1)/2) - (a*(a+1)/2) + a;
        System.out.println("sum is :"+sums);*/
       //using recursion

        int sum = getSum(0,a,b);
        System.out.println("the sum is :"+sum);

    }
    static int getSum(int sum,int i,int b){
        //base case
        if(i>b)      //stop when call go over b
        return sum;

        return i +getSum(sum,i+1,b);
    }
}
