public class thirteen {
    public static void main(String[] args) {
        int num = 1256521,reverse = 0,rem;
        int temp = num;
        while(temp!=0){
            rem = temp %10;
            reverse = reverse *10 +rem;
            temp/=10;
        }
        if(reverse == num)
        System.out.println("number "+num+" is palindrome");
        else System.out.println("number is not palindrome");
    }
    
}
