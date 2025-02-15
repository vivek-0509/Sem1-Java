import java.util.*;

public class map{
   public static void main(String[] args){
    Scanner sc=new Scanner (System.in);

     int T=sc.nextInt();
    for(int a=0;a<T;a++){
      
       int N=sc.nextInt();
       
       int A[]=new int [N];

        for(int j=0;j<A.length;j++){
        A[j]=sc.nextInt();
        }
        
        if(A.length>1){
        int min=A[0];

        for(int i=0;i<A.length-1;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
         
        int count =0;

        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
             A[i]=min;
             count++;
            }
            else if(A[i]<A[i+1]){
                min=A[i];
            }
        }
         
        if(A[A.length-1]>A[A.length-2]){
            count++;
        }

        System.out.println(count);

    }
    //    int count =0;
    //    if(A.length>1){
    //     if(A[0]>A[1]){
    //         A[0]=1;
    //         count++;
    //     }

    //     for(int i=1;i<A.length-1;i++){
    //         if(A[i]>A[i+1]){
    //             A[i]=A[i-1];
    //             count++;
    //         }
    //     }

    //      System.out.println(count);
    //    }

        else{
            System.out.println("0");
        }
    }
   }



}
