public class six{
    public static void main(String[] args) {
        int a = 60;
        int b = 65;
        /* 
        if(a>b){
            System.out.println(a+ " is greater than "+b);
        }else if (a<b){
            System.out.println(b+ " is greater than "+a);

        }else{
            System.out.println("both are equal");
        }*/
        /*Using ternary operator________________________ 
        if(a==b){System.out.println("both are equal");}
        else{
            int temp = a > b ? a : b ;
            System.out.println(temp+ " is largest");
        }*/

        //Using inbuilt Math.max function
        System.out.println(Math.max(a, b) + " is greater");

    }
}