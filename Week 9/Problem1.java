import java.io.*;
import java.util.*;
 public class Problem1 {
	 public static void main(String[] args) throws Exception
    {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int x=0;x<n;x++) a[x]=sc.nextInt();
		int sum=sc.nextInt();
		boolean p=false;
		for(int x=0;x<n;x++) {
			Set<Integer> s=new HashSet<>();
			int f=sum-a[x];
			for(int y=x+1;y<n;y++) {
				int z=f-a[y];
				if(s.contains(z)) {
					p=true;
					System.out.println(a[x]+" "+a[y]+" "+z);
					break;
				}
				else s.add(a[y]);
			}
		}
		if(p==false)
			System.out.println("not found");
	          
      }
	 
	
 }

  


