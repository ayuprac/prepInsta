public class eighteen {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int nextterm;
        int n = 7;
        System.out.print(first + " "+second);
        for(int i = 3;i<=n;i++){
            nextterm = first + second;
            System.out.print(" "+nextterm);
            first = second;
            second = nextterm;

        }
    }
}
