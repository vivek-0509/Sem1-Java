import java.util.*;

public class cp{
   public static void main(String[] args){
    Scanner sc=new Scanner (System.in);

     int T=sc.nextInt();
    for(int a=0;a<T;a++){
      
       int N=sc.nextInt();
       
       int A[]=new int [N];

        for(int j=0;j<A.length;j++){
        A[j]=sc.nextInt();
        }

        Arrays.sort(A);
         int count=0;
         int l=0;
      while(l<A.length-1){
            if(A[l]==A[l+1]){
              count++;
              l=l+2;
            }
            else{
              l=l+1;
            }
        }
        System.out.println(count);
   
    }
    }
   }




