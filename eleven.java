public class eleven {
    // sum of digits
    public static void main(String[] args) {
        //using brute force:
        int num = 12345; /*sum = 0;
        while(num!=0){
            sum+= num % 10;
            num = num/10;
        }
         System.out.println(sum);*/
        System.out.println("Sum of digits:"+ getSum(num));
   
    }
    static int getSum (int num){
    if (num ==0)
    return 0;
    return (num% 10)+ getSum(num/10);
    }
}
