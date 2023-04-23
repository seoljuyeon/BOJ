package Stage3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for( int i = 1; i <= T; i++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());

            bw.write("Case #" + i + ": " );
            bw.write( (Integer.parseInt(st.nextToken())) + (Integer.parseInt(st.nextToken())) +"\n" );

            // 왜 나눠서 쓰지???????
        }

        br.close();

        bw.flush();
        bw.close();

    }
}


/*
System.out.println("Case #" + i + ": " + (Integer.parseInt(st.nextToken())) + (Integer.parseInt(st.nextToken())) +"\n" );
이건ㅇ ㅙ 안 되지................
 */