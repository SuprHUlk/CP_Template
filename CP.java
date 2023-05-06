import java.util.*;
import java.io.*;
 
public class Solution {
    public static void main(String args[]) {
        try {
            FastReader sc=new FastReader();
            FastWriter out = new FastWriter();
            int test=sc.nextInt();         
            while(test-->0) {
                boolean f=true;
                int n=sc.nextInt();
                // //String s=sc.next();
                // //ArrayList <Integer> l=new ArrayList<>();
                // //HashMap<Character, Integer> m=new HashMap<>();
                // char ch[]=sc.next().toCharArray();              
                out.println("");
            }
            out.close();
        }
        catch(Exception e) {
            System.out.println(e);
            return;
        }
    }

    static boolean isPalindrome(String s) {
        StringBuffer s1=new StringBuffer(s);
        if(s1.toString().equals(s1.reverse().toString())) {
            return true;
        }
        else {
            return false;
        }
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

    static int gcd(int a, int b) {
        if(a==0||b==0) {
            return 0;
        }
        if(a==b) {
            return a;
        }
        if(a>b) {
            return gcd(a-b, b);
        }       
        return gcd(a, b-a);
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

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while(st==null||!st.hasMoreTokens()) {
                try {
                    st=new StringTokenizer(br.readLine());
                } 
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str="";
            try {
                str=br.readLine().trim();
            } 
            catch(Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
		private final BufferedWriter bw;
		public FastWriter() {
			this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
		}
		public void print(Object object) throws IOException {
			bw.append(""+object);
		}
		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}
		public void close() throws IOException {
			bw.close();
		}
	}
}           
