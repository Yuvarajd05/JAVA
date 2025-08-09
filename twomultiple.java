import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class twomultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int res =1;
        for(int i=1; i<=10;i++){   
            res = N*i;
            System.out.println("2 x "+i+ " = "+res);
        
        }
        bufferedReader.close();
    }
}
