package practiceone;
import edu.princeton.cs.algs4.*;

import java.sql.Array;
import java.util.Arrays;

public class demo1
{
    public static void main(String[] args)
    {
        System.out.println((0+15)/2);
        System.out.println((2.0e-6 * 100000000.1));
        System.out.println( true && false || true && true);
        System.out.println((1 + 2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(4.1>=4);
        System.out.println(1 + 2 + "3");
        System.out.println('b');
        System.out.println('b'+'c');

        StdOut.println(15/2);
    }

    public static void changeRowCol(String[][] args)
    {
        int M = 9;
        int N = 9;
        for (int i=0; i<M; i++)
        {
            for (int j=0; j<N; j++)
            {
                String temp = args[i][j];
                args[i][j] = args[M-i-1][N-1-j];
                args[M-i-1][N-1-j] = temp;
            }
        }
//        for(int start = 0, end = arr.length -1; start < end; start++,end--)
//        {
//            int[] temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//        }
    }
}
