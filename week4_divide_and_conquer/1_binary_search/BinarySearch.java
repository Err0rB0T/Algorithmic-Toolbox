import java.io.*;
import java.util.*;

public class diagonal  {

    static int binarySearch(int[] a, int y) {
        int left = 0, right = a.length-1;
        int mid;
        while(left<=right) {
            mid = left + ((right - left) / 2);
            if (a[mid] == y) {
                return mid;
            }
            if (a[mid] > y) {
                right = mid - 1;
            } else if (a[mid] < y) {
                left = mid + 1;
            }
        }
        //write your code here

        return -1;
    }

    static int linearSearch(int[] a, int y) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == y) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a, b[i]) + " ");
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
