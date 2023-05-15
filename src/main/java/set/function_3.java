package set;

public class function_3 {
    public static void main (String[] args) {
        int[] x = fill();
        System.out.print("The sequence: ");print(x);
        System.out.print("The sequence of second max : " + maxSecond(x));

    }
    private static int[] fill() {
        int[] x =  {23,9,10,0,0,7,1};
        return x;
    }
    private static int maxSecond(int[] x) {
        int n = x.length, i = 0;
        int m = x[0], s = (int)Double.NEGATIVE_INFINITY;
        while (i < n) {
            if (x[i] > m) {
                s = m;
                m = x[i];
            }
            if (x[i] > s && x[i] != m) {
                s = x[i];
            }
            i++;
        }
        return s;
    }
    private static int maxSecond2(int[] x) {
        int max = m(x);
        return sm(x,max);
    }
    private static int m(int[] x){
        int max = x[0];
        for (int i = 0; i<x.length; i++) max = (x[i]>max)?x[i]:max;
        return max;
    }
    private static int sm(int[] x, int m){
        int max = (int)Double.NEGATIVE_INFINITY;
        for (int i = 0; i<x.length; i++) {
            max = (x[i] > max && m != x[i]) ? x[i] : max;
        }
        return max;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print("\t" + x[i] + "\t" );
        }
        System.out.println();
    }
}
