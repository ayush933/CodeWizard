import java.io.*;
import java.util.*;
 public class P2 {
	 public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String s=br.readLine();
	    String w=br.readLine();
	    char ch[]=s.toCharArray();
	    Set<Character> S=new HashSet<>();
	    for(int i=0;i<w.length();i++) {
	    	S.add(Character.toLowerCase(w.charAt(i)));
	    	S.add(Character.toUpperCase(w.charAt(i)));
	    }
	    boolean marked[]=new boolean[s.length()];
	    for(int i=0;i<s.length();i++) {
	    	if(S.contains(ch[i])) marked[i]=true;
	    }
	    StringBuilder sb=new StringBuilder();
	    for(int i=0;i<ch.length;i++) {
	    	if(!marked[i]) sb.append(ch[i]);
	    }
	    System.out.println(sb.toString());
    }
 }
