import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) {
        boolean []check = new boolean[100000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check[1] = true ;
        check[0] = true ;
        for( int i = 2 ; i*i <= n ; i++) {
            if (check[i] == false) {
                for (int j = i * i; j <= n; j = j + i) {
                    check[j] = true;
                }
            }
        }
        for(int i = 2 ; i<= n ; i++){
            if(check[i] == false){
                System.out.println(i);
            }
        }

    }
}
