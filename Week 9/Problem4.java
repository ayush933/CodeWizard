import java.io.*;
import java.util.*;
 public class Problem4 {
	 public static void main(String[] args) throws Exception
    {
		Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        
         int ele=0;
         int spaces=0;
         if(n%2==0)
        	 spaces=n/2;
         else
        	 spaces=n/2+1;
         for(int i=1;i<=n/2;i++) {
        	 for(int j=1;j<=spaces-1;j++) {
        		 System.out.print(" ");
        	 }
        	 
        	 for(int j=ele+1;j>1;j--) {
        		 System.out.print(j);
        	 }
        	 System.out.print(1);
        	 for(int j=2;j<=ele+1;j++) {
        		 System.out.print(j);
        	 }
        	 for(int j=1;j<=spaces-1;j++) {
        		 System.out.print(" ");
        	 }
        	 System.out.println();
        	 spaces--;
        	 ele++;
        	 
         }
         if(n%2!=0) {
         
    	 for(int j=1;j<=spaces-1;j++) {
    		 System.out.print(" ");
    	 }
    	 
    	 for(int j=n/2+1;j>1;j--) {
    		 System.out.print(j);
    	 }
    	 System.out.print(1);
    	 for(int j=2;j<=n/2+1;j++) {
    		 System.out.print(j);
    	 }
    	ele=n/2;
    	 System.out.println();
         }
         
         spaces=2;
         
         for(int i=1;i<=n/2;i++) {
        	 for(int j=1;j<=spaces-1;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=ele;j>1;j--) {
        		 System.out.print(j);
        	 }
        	 System.out.print(1);
             for(int j=2;j<=ele;j++) {
            	 System.out.print(j);
             }
             for(int j=1;j<=spaces-1;j++) {
        		 System.out.print(" ");
        	 }
             System.out.println();
             spaces++;
             ele--;
             
         }
         
       
      
      
        	 
         
    
    }
    
 }

  

