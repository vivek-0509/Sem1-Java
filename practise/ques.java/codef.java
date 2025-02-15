import java.util.*;
public class codef{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int T=sc.nextInt();
         
       for(int a=0;a<T;a++){
        int N=sc.nextInt();
        int A[]=new int [2*N];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
          int m=0;
          int c=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
               m++;
            }
            if(A[i]==1){
                c++;
            }
        }

      
        if(m%2==0 && c%2==0){
            System.out.print("0 ");
        }
        else{
            System.out.print(m%2 +" ");
        }
        System.out.print(Math.min(m,c)+" ");
       }
    
    }
}
