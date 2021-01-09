import java.io.*;
import java.util.*;
 public class Problem1 {
	 public static void main(String[] args) throws Exception
    {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int sum=sc.nextInt();
		boolean pos=false;
		for(int i=0;i<n;i++) {
			Set<Integer> set=new HashSet<>();
			int f=sum-a[i];
			for(int j=i+1;j<n;j++) {
				int k=f-a[j];
				if(set.contains(k)) {
					pos=true;
					System.out.println(a[i]+" "+a[j]+" "+k);
					break;
				}
				else {
					set.add(a[j]);
				}
			}
		}
		if(pos==false)
			System.out.println("not found");
	          
      }
	 
	
 }

  


