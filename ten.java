public class ten {
    public static void main(String[] args) {
        int lower = 1,upper = 20;
        for(int i = lower;i<=upper;i++){
            if(isPrime(i))
            System.out.println(i);
        }
        //other way
        for(int i = lower;i<=upper;i++){
            if(isprime2(i))
            System.out.print(i +" ");
        }
       
    }
    static boolean isPrime(int n){
        int count = 0 ;
        if(n<2)return false;
        for(int i = 2;i<=Math.sqrt(n); i++){
            if(n % i ==0)
            return false;
        }
        return true;
    }
    static boolean isprime2(int n){
      int count = 0;
    if(n<2)
    return false;
    for(int i =2;i<=n/2;i++){
        if(n % i ==0){
            return false;
        }
    }
    return true;

    }
}
