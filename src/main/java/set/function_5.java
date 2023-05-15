package set;

public class function_5 {
    public static void main (String[] args) {
        int[] x = fill();
        System.out.print("The sequence: ");print(x);
        System.out.println("The maximum length of the monotonous part of the sequence : " +
                maximumLengthMonotonousPartSequence(x));
    }
    private static int[] fill() {
        int[] x =  {5,4,3,3,1};
        return x;
    }

    private static int maximumLengthMonotonousPartSequence(int[] a) {
        int n = a.length;
        int maxLen = 1; // maximum length of the monotone section
        int len = 1; // the current length of the monotone section
        int type = 0; // monotonicity type: 0 - indeterminate, 1 - nonincreasing, 2 - nonincreasing,
                      // 3 - increasing, 4 - decreasing
        boolean monotonic = true; // the function is monotone
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i-1]) { // if the current element is larger than the previous one
                if (type == 0) {
                    type = 3;
                    len++; // increase the length of the monotone section
                } else if (type == 1) {
                    type = 1;
                    len++; // increase the length of the monotone section
                } else if (type == 2) {
                    type = 3;
                    len = 2; // reset the length of the monotone section
                    monotonic = false;
                } else if (type == 3) {
                    type = 3;
                    len++; // increase the length of the monotone section
                } else if (type == 4) {
                    type = 3;
                    len = 2; // reset the length of the monotone section
                    monotonic = false;
                }
            } else if (a[i] < a[i-1]) { // if the current element is smaller than the previous one
                if (type == 0) {
                    type = 4;
                    len++; // increase the length of the monotone section
                } else if (type == 1) {
                    type = 4;
                    len = 2; // reset the length of the monotone section
                    monotonic = false;
                } else if (type == 2) {
                    type = 2;
                    len++; // increase the length of the monotone section
                } else if (type == 3) {
                    type = 4;
                    len = 2; // reset the length of the monotone section
                    monotonic = false;
                } else if (type == 4) {
                    type = 4;
                    len++; // increase the length of the monotone section
                }
            } else { // if the current element is equal to the previous one
                if (type == 0) {
                    type = 0;
                } else if (type == 1) {
                    type = 1;
                } else if (type == 2) {
                    type = 2;
                } else if (type == 3) {
                    type = 1;
                } else if (type == 4) {
                    type = 2;
                }
            }
            maxLen = Math.max(maxLen, len); // update the maximum length of the monotone section
        }
        return maxLen;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t  " );
        }
        System.out.println();
    }
}

