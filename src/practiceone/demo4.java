package practiceone;

import edu.princeton.cs.algs4.StdOut;

public class demo4 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i=0; i<=15;i++)
        {
            StdOut.println(f);
            f = f+g;
            g = f-g;
            StdOut.printf("当前f的值为 %d, 当前g的值为 %d,", f, g);
            StdOut.println();
        }

    }
}
