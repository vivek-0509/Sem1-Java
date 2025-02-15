import java.util.*;

public class patterm16{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int d=1;
        for(int a=1; a<=N; a++){
            
            // int m=d;
            
            // while(m<d+a){
            //     System.out.print(m+" ");
            //     m++;
            // }
            for(int m=d;m<d+a;m++){
                System.out.print(m+" ");
            }
             
        System.out.println("");
        d=d+a;
    }
    }
}
