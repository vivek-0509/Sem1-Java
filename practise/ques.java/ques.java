
import java.util.*;

public class ques{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        for(int i =1;i<=N;i++){
            if(N%2==0){
                  System.out.print(i+" ");
            }
          
        }
    }
}
