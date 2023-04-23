package Stage2;
        import java.util.Scanner;
public class BOJ2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int reward = 0;

        if( A == B && B == C ){
            reward = 10000 + A*1000;
        } else if( A == B && B != C || A != B && B == C ){
            reward = 1000 + B*100;
        } else if( A == C && B != C ){
            reward = 1000 + A*100;
        } else if( A != B && B != C ){
            if( A > B ){
                reward = ( A > C )? A*100 : C*100;
            } else if( A < B){
                reward = ( B < C )? C*100 : B*100;
            }
        }

        System.out.println(reward);
    }
}
