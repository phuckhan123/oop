import java.util.Scanner;

public class Allequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( a == b && a == c){
            System.out.println("All equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
