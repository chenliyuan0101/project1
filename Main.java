import java.io.*;
import java.util.*;

public class Main {


    static BufferedReader br =
        new BufferedReader(
            new InputStreamReader(System.in)
        );


    static StringTokenizer st;


    static String next() throws Exception{

        while(st==null || !st.hasMoreTokens())
            st=new StringTokenizer(br.readLine());

        return st.nextToken();

    }


    static int nextInt() throws Exception{

        return Integer.parseInt(next());
    }



    public static void main(String[] args)throws Exception{


        int n=nextInt();


        int[] a=new int[n];


        for(int i=0;i<n;i++)
            a[i]=nextInt();



        StringBuilder sb=new StringBuilder();


        for(int x:a)
            sb.append(x).append(" ");


        System.out.print(sb);

    }

}