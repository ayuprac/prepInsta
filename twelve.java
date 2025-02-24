public class twelve{
    public static void main(String[] args) {
        
        int num = 24589,reverse = 0,rem;
        System.out.println("original no: "+num);
        while(num!=0){
            rem = num % 10;
            reverse = reverse*10 +rem;
            num/=10;
        }
       
        System.out.println("reversed no: "+reverse);
    }
}