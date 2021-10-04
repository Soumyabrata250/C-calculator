import java.io.*;
import java.util.*;
import java.lang.*;
public class stairs
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=Integer.parseInt(args[0]);
int[] arr=new int[n];
for(int i=1;i<args.length;i++)
arr[i-1]=Integer.parseInt(args[i]);
Integer[] dp = new Integer[n + 1];
      dp[n] = 0;

      for (int i = n - 1; i >= 0; i--) {
         if (arr[i] > 0) {
            int min = Integer.MAX_VALUE;

            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
               if(dp[i + j] != null){
                  min = Math.min(min, dp[i + j]);
               }
            }

            if(min != Integer.MAX_VALUE){
               dp[i] = min + 1;
            }
         }
      }

      System.out.println(dp[0]);
   


////////////////////////////////////
}

//System.out.println();


}