package codeforces;
import java.util.*;
class Solution{
    public static void main(String [] args){
        int t;
        Scanner scan=new Scanner(System.in);
        int m,n,p;
        int[][] arr;
        t=scan.nextInt();
        for(int k=0;k<t;k++){
            m=scan.nextInt();
            n=scan.nextInt();
            p=scan.nextInt();
            arr = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                   arr[i][j]=scan.nextInt();
                }
            }
            long res=0;
            for(int j=0;j<n;j++){
                int max=Integer.MIN_VALUE;
                for(int i=0;i<m;i++){
                    if(arr[i][j]>max)
                        max=arr[i][j];
                }
                res+=(max-arr[p-1][j]);
            }
            System.out.println("Case #"+(k+1)+": "+res);
            
       
    }
        scan.close();
}
}