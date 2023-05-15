package set;

public class function_4 {
    public static void main (String[] args) {
        int[] x = fill();
        System.out.print("The sequence: ");print(x);
        System.out.print("The maximum going in a row : " + maxGoingInRow2(x));
    }
    private static int[] fill() {
        int[] x =  {1,1,1,2,0,0,0,0,5,2,9,9,9,9,9,9,8,8};
        return x;
    }
    private static int maxGoingInRow(int[] x) {
        int n = x.length, i = 0;
        int m = 0, cm = 0, l = x[0];
        while (i < n) {
            if (x[i] == l) {
                cm++;
                if (cm > m) m = cm;
            } else {
                cm = 1;
                l = x[i];
            }
            i++;
        }
        return m;
    }
    private static int maxGoingInRow2(int[] x) {
        int n = x.length-1, i = 0, res = 0;
        while (i < n) {
            int m = ms(x,i);int q = qe(x,i);
            if (ee(x,i) == x[++i]) {
                if (q + 1 > m) {
                    res = q + 1;
                }
            }
        }
        return res;
    }
    private static int ms(int[] x, int idx) {
        int i = 0,m = 0, cm = 0, l = x[0];
        while (i <= idx) {
            if (x[i] == l) {
                cm++;
                if (cm > m) m = cm;
            } else {
                cm = 1;
                l = x[i];
            }
            i++;
        }
        return m;
    }
    private static int qe(int[] x,int idx) {
        int i = 0, m = 0, l = x[0];
        while (i <= idx) {
            if (x[i] == l) {
                m++;
            } else {
                m = 1;
                l = x[i];
            }
            i++;
        }

        return m;
    }
    private static int ee(int[] x,int idx) {
        return x[idx];
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t  " );
        }
        System.out.println();
    }
}
