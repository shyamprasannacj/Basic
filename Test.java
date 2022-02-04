import java.util.*;
import java.io.*;
public class Test {
    public static void main(String args[]) {
 
      try {  
          FileInputStream instream = new FileInputStream("input.txt"); 
          System.setIn(instream);  
          PrintStream outstream = new PrintStream(new FileOutputStream("output.txt")); 
          System.setOut(outstream);      
      } catch (Exception e) {} 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s;
      int x=0;
      while(n--!=0){
            s=sc.next();
            if (s.charAt(0)=='+' || s.charAt(s.length()-1)=='+') x++;
            else if (s.charAt(0)=='-' || s.charAt(s.length()-1)=='-') x--;
      }
      System.out.print(x);
    }
}