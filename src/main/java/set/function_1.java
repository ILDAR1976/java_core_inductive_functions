package set;

public class function_1 {
    public static void main (String[] args) {
        int[] x = fill();
        System.out.print("The main sequence: ");print(x);
        System.out.print("Value of avg : " + avg2(x));

    }
    private static int[] fill() {
        int[] x =  {1,2,3,4};
        return x;
    }
    private static double avg(int[] x) {
        int n = x.length,i = 0, l = 0;
        double result = 0, sum = 0;
        while (i < n) {
            sum += x[i];l++;i++;
        }
        result = sum/l;
        return result;
    }
    private static double avg2(int[] x) {
        return sum(x) / l(x);
    }
    private static double sum(int[] x){
        int sum = 0;
        for (int i = 0;i<x.length;i++) sum += x[i];
        return sum;
    }
    private static int l(int[] x){
        return x.length;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
