
import java.util.*;

public class pattern13{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int a=1;a<=N;a++){
            for(int m=1;m<=a;m++){
            if(m%2!=0){
                for(int s=0;s<m;s=s+2){
                    System.out.print(m);
                    break;
                }
            }
             
             else{
                     System.out.print(" ");
                 }
                 
            }
            System.out.println("");
        }
    }
}
