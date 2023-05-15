package set;

public class function_6 {
    public static void main (String[] args) {
        int[] x = fill();
        System.out.print("The sequence: ");print(x);
        System.out.print("The number of digit groups one : " + numberDigitGroupsOne(x));
    }
    private static int[] fill() {
        int[] x =  {1,1,1,0,1,1,1,1,0,1,0,1,0,1};
        return x;
    }
    private static int numberDigitGroupsOne(int[] x) {
        int n = x.length, ns = 0, wc = 1;
        for(int i = 0; i < n - 1; i++) {
            if (x[i] == 1 && x[i+1] != 0) {
                ns++;
            }
            if (x[i] == 0) {
                ns = 0;
                wc++;
            }
        }
        return wc;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t  " );
        }
        System.out.println();
    }
}
