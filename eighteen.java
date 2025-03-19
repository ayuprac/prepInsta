public class eighteen {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int nextterm;
        int n = 7;
        //print the first two numbers
        System.out.print(first + " "+second);
        //iteration loop from third numbers
        for(int i = 3;i<=n;i++){
            nextterm = first + second;
            System.out.print(" "+nextterm);
            first = second;
            second = nextterm;

        }
    }
}
