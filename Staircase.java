import java.io.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
        int spaces = n-1;
        
        for(int index = 0; index < n; index++) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= n-spaces; i++) {
                System.out.print("#");
            }
            System.out.println();
            spaces--;
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
