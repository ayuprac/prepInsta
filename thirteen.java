public class thirteen {
    public static void main(String[] args) {
        int num = 1256521,reverse = 0,rem;
        /* 
        int temp = num;
        while(temp!=0){
            rem = temp %10;
            reverse = reverse *10 +rem;
            temp/=10;
        }
        if(reverse == num)
        System.out.println("number "+num+" is palindrome");
        else System.out.println("number is not palindrome");
        */

        if(getReverse(num,reverse)==num)
        System.out.println(num+ " is Palindrome");
        else System.out.println(num+ " is not palindrome");
    }
    static int getReverse(int num,int rev){
        if(num==0)
         return rev;

        int rem = num % 10;
        rev = rev * 10 + rem;
         return getReverse(num/10,rev);
    }
    
}
