public class nineteen {
    public static void main(String[] args) {
        int num = 6;
        System.out.println("Factorial of "+ num + " is : "+factorial(num));
    }
    static int factorial (int n){
        int res = 1,i;
        for(i = 2;i<=n;i++)
        res *= i;
        return res;
    }
}
