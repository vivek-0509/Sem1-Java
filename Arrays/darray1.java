import java.util.*;
class darray1{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
      int l=sc.nextInt();
      int b=sc.nextInt();
     
      int[] [] M= new int[l] [b];
      // M[0]=new int[5];
      // M[1]=new int[3];
      // M[2]=new int[8];

    //   for(int i=0;i<M.length;i++){
    //     for(int j=0;j<M[0].length;j++){
    //       M [i][j]=sc.nextInt();
            
    //     }
    //     System.out.println("");
    //   }
     
    for(int i=0;i<M.length;i++){
      for(int j=0;j<M[i].length;j++){
          // M [i][j]=sc.nextInt(),();
          M[i][j]=sc.nextInt();
      }
      System.out.println("");
    }
      int C[][]=new int[b][l];

     for(int i=0;i<M[0].length;i++){
      for(int j=0;j<M.length;j++){
        
        C[i][j]=M[j][i];


      }
     }

      for(int i=0;i<C.length;i++){
        for(int j=0;j<C[i].length;j++){
            // M [i][j]=sc.nextInt(),();
            System.out.print(C[i][j]);
        }
        System.out.println("");
      }
     
     
    }
}