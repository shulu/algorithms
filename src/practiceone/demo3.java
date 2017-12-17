package practiceone;

import edu.princeton.cs.algs4.StdOut;
//判断输入的两个double变量是否都在0-1
public class demo3
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        boolean m = ((a>0)&&(a<1));
        boolean n = ((b>0)&&(b<1));
        if (m&&n)
        {
            StdOut.printf("true");
        }else {
            StdOut.printf("false");
        }
    }
}
