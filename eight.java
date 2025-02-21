public class eight {
    public static void main(String[] args) {
        int year = 2000;
        /*
        if(year % 400 ==0 ){
            System.out.println(year+ " is a leap year");
        }else if(year %4==0 && year % 100!=0){
           System.out.println(year+  "is a leap year");
        }else{
            System.out.println(year+ "is not a leap year");
        }*/
        //second way
        if(year%400==0 || (year%4==0&&year%100!=0)){
            System.out.println(year+ " is leap.");
        }else{
            System.out.println("not a leap year");
        }
    }
}
