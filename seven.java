// Using && operator
public class seven{
    public static void main(String[] args) {
        int a = 40,b=60,c=800;
<<<<<<< HEAD
        //using if else
=======
>>>>>>> 54c020258302da5bfe095107db81c1b40ae64a01
        /* 
        if(a>b && a>c){
        System.out.println(a+ " is greater");
        }else if(b>a && b>c){
            System.out.println(b+" is greater");
        }else{
            System.out.println(c +" is greater");
        }*/
        //using ternary operator
        int temp,result;
        temp = a > b ? a:b;
        result = temp>c ?temp:c;
        System.out.println(result + " is greatest ");

       
    }
}
