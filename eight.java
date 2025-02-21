public class eight {
    public static void main(String[] args) {
        int year = 1900;
        /*
        if(year % 400 ==0 ){
            System.out.println(year+ " is a leap year");
        }else if(year %4==0 && year % 100!=0){
           System.out.println(year+  "is a leap year");
        }else{
            System.out.println(year+ "is not a leap year");
        }*/
        //second way
        /*if(year%400==0 || (year%4==0&&year%100!=0)){
            System.out.println(year+ " is leap.");
        }else{
            System.out.println("not a leap year");
        }*/
        //using ternary
        int flag = (year%400==0||(year%4==0&&year%100!=0)) ?1:0;
        if(flag==1){
            System.out.println(year + "is leap year");
        }else {
            System.out.println(year+ " is not leap");
        }
        //using boolean
        int year1=2024;
        boolean leap;
        if(year1%400 ==0)
            leap=true;

        else if(year1 %4 ==0 && year1%100!=0)
            leap = true;
        else 
        leap = false;

        if(leap)
        System.out.println(year1+ " is a leap year");
        else
        System.out.println(year1 + " is not a leap year.");
    }
}
