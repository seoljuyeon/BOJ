package Stage3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while( true ){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0) {
                break;
            }

            bw.write(A + B + "\n");   // 줄바꿈 꼭 꼭..........


        }

        br.close();

        bw.flush();
        bw.close();

    }
}
