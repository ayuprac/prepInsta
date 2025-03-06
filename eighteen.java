public class eighteen {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int sum;
        int n = 6;
        System.out.print(first + " "+second);
        for(int i = 3;i<=n;i++){
            sum = first + second;
            System.out.print(" "+sum);
            first = second;
            second = sum;

        }
    }
}
