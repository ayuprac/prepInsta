public interface nine {
     public static void main(String[] args) {
        int n = 23;
        boolean isprime = true;
        if(n<2)
        isprime = false;
        else
            for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime = false;
                break;
            }
           
        }
 String result = isprime ? "Prime":"not Prime";
System.out.println("the number "+n+ " is "+ result);
     }

 
}
