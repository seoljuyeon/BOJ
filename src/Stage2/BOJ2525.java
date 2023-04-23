package Stage2;
import java.util.Scanner;
public class BOJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if( B + C < 60 ){
            B += C;
        } else if( B + C >= 60 ){
            A += 1;
            B = B + C - 60;
            if( B == 60 ){
                A += 1;
                B = 0;
            }
            if( B > 60 ){              // 0 30 120 연성님 반례
                A += B/60;
                B = B%60;
            }
        }

        if( A >= 24 ){
            A -= 24;
        }

        System.out.println(A + " " + B);
    }
}
