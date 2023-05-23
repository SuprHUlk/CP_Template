import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-->0) {
            boolean f=true;
            int n=sc.nextInt();
            // Comparator<Pair> com=new Comparator<Pair>() {
            //     public int compare(Pair i, Pair j) {
            //         if(i.b==j.b) {
            //             return 0;
            //         }
            //         else if(i.b>j.b) {
            //             return 1;
            //         }
            //         return -1;
            //     }
            // };
            // String s=sc.next();
            // ArrayList <Integer> l=new ArrayList<>();
            // PriorityQueue <Long> pq=new PriorityQueue<>();
            // HashMap<Integer, Integer> m=new HashMap<>();
            // HashSet<String> set=new HashSet<>();  
            // char ch[]=sc.next().toCharArray();
            
            pw.println();
        }
        pw.close();
    }

    public static class Pair {
        char a;
        int b;
        Pair(char a, int b) {
            this.a=a;
            this.b=b;
        }
    }

    static boolean isPalindrome(String s) {
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrime(int num) {
        if(num<=1) {
            return false;
        }
        for(int i=2;i<=num/2;i++){
           if((num%i)==0) {
            return false;
           }
       }
       return true;
    } 

    static boolean isCPrime(int a, int b) {
        int min=Math.min(a,b);
        for(int i=min;i>=2;i--) {
            if(a%i==0&&b%i==0) {
                return false;
            }
        }
        return true;
    }

    static long getSum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static long gcd(long x, long y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }

    static long lcm(long a, long b) {
        return (1l * a * b) / gcd(a, b);
    }

    static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static int setBit(int mask, int idx) {
        return mask | (1 << idx);
    }

    public static boolean checkBit(int mask, int idx) {
        return (mask & (1 << idx)) != 0;
    }

    public static long setBit(long mask, int idx) {
        return mask | (1l << idx);
    }

    public static boolean checkBit(long mask, int idx) {
        return (mask & (1l << idx)) != 0;
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public long[] nextlongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public Long[] nextLongArray(int n) throws IOException {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i <n; i++)
                a[i] = nextInt();
            return a;
        }

        public int[][] nextGrid(int n, int m) throws IOException {
            int[][] arr = new int[n][m];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextIntArray(m);
            }
            return arr;
        }

        public int[] nextIntCharArray() throws IOException {
            char[] b = sc.next().toCharArray();
            int n = b.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = b[i] - '0';
            return a;
        }

        public int[] NextIntArray(int n) throws IOException {
            int[] arr = new int[n + 1];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            pw.print(arr[i] + " ");
        }
        pw.println();
    }

    public static void print(int[] arr, String separator) {
        for (int i = 0; i < arr.length; i++) {
            pw.print(arr[i] + separator);
        }
        pw.println();

    }

    public static void print(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            pw.print(arr[i] + " ");
        }
        pw.println();
    }

    public static void print(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            pw.print(arr.get(i) + " ");
        }
        pw.println();
    }

    public static void print(int[][] arr) {
        for (int[] i : arr) {
            print(i);
        }
    }

    public static void print(long[][] arr) {
        for (long[] i : arr) {
            print(i);
        }
    }

    public static void print(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            pw.print(arr[i] + " ");
        }
        pw.println();
    }

    static int inf = 1000000050;
    static long mod = 1000000007;
    static Random rn = new Random();
    static Scanner sc = new Scanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
}
