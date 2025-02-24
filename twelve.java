public class twelve{
    /*
    public static void main(String[] args) {
        
        int num = 24589,reverse = 0,rem;
        System.out.println("original no: "+num);
        while(num!=0){
            rem = num % 10;
            reverse = reverse*10 +rem;
            num/=10;
        }
       
        System.out.println("reversed no: "+reverse);
    } */

    public static void main(String[] args) {
        int num = 245789,rev=0;
        System.out.println("Reversed no: "+getReverse(num,rev));
    }
    static int getReverse(int num,int rev){
        if(num == 0)
        return rev;
        int rem = num%10;
        rev = rev*10 +rem;

        return getReverse(num/10,rev);
    }
}