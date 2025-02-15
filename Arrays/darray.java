import java.util.*;
class darray{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
      int N=sc.nextInt();
      int Y=sc.nextInt();
      int[] [] M= new int[N] [Y];

      for(int i=0;i<M.length;i++){
        for(int j=0;j<M[0].length;j++){
          M [i][j]=sc.nextInt();
            
        }
        System.out.println("");
      }
     


      for(int i=0;i<M.length;i++){
        for(int j=0;j<M[0].length;j++){
            // M [i][j]=sc.nextInt(),();
            System.out.print(M[i][j]);
        }
        System.out.println("");
      }
     
     
    }
}