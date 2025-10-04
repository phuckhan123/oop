import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  power = sc.nextInt();
        int count = 1 ;
        int ans = 1 ;
        while( count <= power){
            ans = ans * 2 ;
            count ++;
        }
        System.out.println(ans);
    }
}
