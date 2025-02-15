import java.util.*;
public class seniorques{
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
        int N=sc.nextInt();
        

        int A [] =new int [N];
        for(int i =0;i<N;i++){
          
               A[i]=sc.nextInt();
            
        }
       int max=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
              if(A[i]*A[j]>max && i!=j){
                max=A[i]*A[j];
              }
            }
        }
       System.out.println(max);
    }
}
