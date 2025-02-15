import java.util.*;
public class codec{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int T=sc.nextInt();
         
       for(int a=0;a<T;a++){
        int N=sc.nextInt();
        int A[]=new int [N];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
          int c=0;
        for(int i =0;i<A.length-2;i++){
            if(A[i]+A[i+1]>A[i+2]){
             c++;
            }
        }
        System.out.println(c);
       }
    
    }
}
