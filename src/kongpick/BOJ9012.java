package kongpick;
import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
    public static void isVPS(String str) {

        Stack<Character> stack = new Stack<>();

        for( int i = 0; i < str.length(); i++ ){
            char c = str.charAt(i);

            if( c == '('){
                stack.push(c);
            } else {
                if( stack.isEmpty() ){
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if( stack.isEmpty() ) System.out.println("YES");
        else System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for( int i = 1; i <= T; i++ ){
            isVPS(sc.next()); //이거였다니!!!!!!!!!!!!!!!!!
        }
    }
}
