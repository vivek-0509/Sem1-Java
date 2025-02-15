import java.util.*;

public class arrayins{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int k=sc.nextInt();
       int [] M= new int[N];
       for(int i=0;i<M.length;i++){
        M[i]=sc.nextInt();
       }
    
    
       for(int s=M.length-1;s>2;s--){
         M[s]=M[s-1];
       } 
       M[2]=k;
       for(int s=0;s<M.length;s++){
        System.out.print(M[s]+",");
       }
       
   }



}

// Scanner sc =new Scanner(System.in);
// int N=sc.nextInt();
// int[] M= new int [N];

// for(int i=0; i<M.length;i++){
//   M[i]=sc.nextInt();
// }

// //   for(int s=1;s<M.length;s++){
  
// //     System.out.print(M[s]+",");
// //     System.out.println("");
// //   }

// int m=M[0];
// for(int s=1;s<M.length;s++){
  
//   M[s-1]=M[s];
// }
// M[M.length-1]=m;

// for(int s=0;s<M.length;s++){
  
//   System.out.print(M[s]+",");
//   // System.out.println("");
// }
