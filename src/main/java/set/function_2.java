package set;

public class function_2 {
    public static void main (String[] args) {
        int[] x = fill();
        System.out.print("The sequence: ");print(x);
        System.out.print("Quantity sequence of max : " + maxEqualsQuantity2(x));

    }
    private static int[] fill() {
        int[] x =  {6,5,6,6,4,2,2};
        return x;
    }
    private static int maxEqualsQuantity(int[] x) {
        int n = x.length, i = 0;
        int max = x[0], qm = 0;
        while (i < n) {
            if (x[i] > max) {
                max = x[i];
                qm = 0;
            }
            if (x[i] == max ) qm++;
            i++;
        }
        System.out.print("Maximum element: " + max + " ");
        return qm;
    }
    private static int maxEqualsQuantity2(int[] x) {
        int me = m(x);
        System.out.print("Maximum element: " + me + " ");
        return qm(x,me);
    }
    private static int m(int[] x){
        int max = x[0];
        for (int i = 0; i<x.length; i++) max = (x[i]>max)?x[i]:max;
        return max;
    }
    private static int qm(int[] x,int m){
        int qm = 0;
        for (int i = 0; i<x.length; i++) qm += (x[i]==m)?1:0;
        return qm;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t  " );
        }
        System.out.println();
    }
}
