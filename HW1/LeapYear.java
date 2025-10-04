import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 400 == 0){
            System.out.println("LeapYear");
        }
        else if(year % 4 == 0 && year % 100 == 0){
            System.out.println("Not LeapYear");
        }
        else if( year % 4 == 0 ){
            System.out.println("LeapYear");
        }
        else{
            System.out.println("Not LeapYear");
        }
    }
}
