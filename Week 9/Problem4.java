import java.io.*;
import java.util.*;
public class P4 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
         int n=sc.nextInt(),e=0,sp=0;
         if(n%2==0) sp=n/2;
         else sp=n/2+1;
         for(int i=1;i<=n/2;i++) {
        	 for(int j=1;j<=sp-1;j++) System.out.print(" ");
        	 for(int j=e+1;j>1;j--) System.out.print(j);
        	 System.out.print(1);
        	 for(int j=2;j<=e+1;j++) System.out.print(j);
        	 for(int j=1;j<=sp-1;j++) System.out.print(" ");
        	 System.out.println();
        	 sp--;
        	 e++;
         }
         if(n%2!=0) {
    	 for(int j=1;j<=sp-1;j++) System.out.print(" ");
    	 for(int j=n/2+1;j>1;j--) System.out.print(j);
    	 System.out.print(1);
    	 for(int j=2;j<=n/2+1;j++) System.out.print(j);
    	 e=n/2;
    	 System.out.println();
         }
         sp=2;
         for(int i=1;i<=n/2;i++) {
        	 for(int j=1;j<=sp-1;j++) System.out.print(" ");
        	 for(int j=e;j>1;j--) System.out.print(j);
        	 System.out.print(1);
             for(int j=2;j<=e;j++) System.out.print(j);
             for(int j=1;j<=sp-1;j++) System.out.print(" ");
             System.out.println();
             sp++;
             e--;
        }
    }
 }
