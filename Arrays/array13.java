import java.util.*;
class array13{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     
      int N=sc.nextInt();
      int [] M=new int[N];
   
      for(int i=0;i<M.length;i++){
        M[i]   = sc.nextInt();
      }

      int l=sc.nextInt();
      int m=sc.nextInt();

     
        for(int j=l ,i=0; j<m+1;j++,i++){
            M[j]=M[m-i];
         }
         
      

      for(int i=0;i<M.length;i++){
        System.out.print(M[i]+" ");
      }
    }
}
