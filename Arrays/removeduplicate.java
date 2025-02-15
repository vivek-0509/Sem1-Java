import java.util.*;
class removeduplicate{
    public static void main(String [] Args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
    
        for(int i=0;i<A.length;i++){
           A[i]=sc.nextInt();
        }
         
        int c=0;
        for(int i =0;i<A.length;i++){
        for(int j=i+1;j<A.length;j++){
           if(A[i]==A[j]){
             c++;
             break;
           }
         }
        if(c==0){
            System.out.print(A[i]+' ');
        }


        }
         
    }
}