import java.util.*;
class array6{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     
      int N=sc.nextInt();
      int [] M=new int[N];
   
      for(int i=0;i<M.length;i++){
        M[i]   = sc.nextInt();
      }

      int k=sc.nextInt();

      for(int i=0; i<M.length;i++){
        if(k==M[i]){
            System.out.println(i);
            break;
        }
      }
    }
}