//Power code
public class twentyone {
    /*
    public static void main(String[] args){
        double base = 4;
        double expo1 = 2;
        double expo2 = -2.5;
        double res1,res2;

        //calculate the power
        res1 = Math.pow(base,expo1);
        res2 = Math.pow(base,expo2);

        System.out.println(base+" ^ "+ expo1+ " = "+ res1);
        System.out.println(base+" ^ "+ expo2+ " = "+ res2);


    } */

    public static void main(String[] args) {
	    
        double base = 8;
        // Works only when exponent is positive integer
        int expo = 2;
        double res = 1.0;
        
        while (expo != 0) {
            res *= base;
            expo--;
        }
        
        System.out.println("Result = " + res); 
        }
}
