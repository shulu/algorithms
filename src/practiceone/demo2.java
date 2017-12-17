package practiceone;
import edu.princeton.cs.algs4.*;

public class demo2 {

    /**
     *判断三个数字是否都相等
     */
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        StdOut.printf("%d, %d, %d", a, b ,c);
        if ((a==b) && (b==c))
        {
            StdOut.println("equal");
        }else{
            StdOut.println("not equal");
        }
    }
}
