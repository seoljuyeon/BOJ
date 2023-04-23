package Stage2;
import java.util.Scanner;
public class BOJ2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m >= 45) {
            m -= 45;
        } else if( m < 45 ){
            if( h >= 1 ) {
                h -= 1;
                m += 15;
            } else if( h == 0 ) {
                h = 23;
                m += 15;
            }
        }
        System.out.println(h + " " + m);
    }
}

