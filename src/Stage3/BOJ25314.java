package Stage3;
import java.util.Scanner;
public class BOJ25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = "";

        for( int i = 1; i <= N/4; i++ ){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
