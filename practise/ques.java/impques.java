import java.util.*;
public class impques{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
         
         for(int i=0;i<N;i++){
            for(int j=0;j<N-1-i;j++){
                System.out.print(" ");
            }
            int number =1;
            for(int j=0;j<=i;j++){
            
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
         }
    
    }
}
