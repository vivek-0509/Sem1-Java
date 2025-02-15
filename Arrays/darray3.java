import java.util.*;
class darray3{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
      int X=sc.nextInt();
      int Y=sc.nextInt();
     
      int[] [] M= new int[X] [Y];
      int[] [] S= new int[X] [Y];
      int[] [] C= new int[X] [Y];

      for(int i=0;i<M.length;i++){
        for(int j=0;j<M[0].length;j++){
          M [i][j]=sc.nextInt();
            
        }
        
      }


      for(int i=0;i<S.length;i++){
        for(int j=0;j<S[0].length;j++){
          S [i][j]=sc.nextInt();
            
        }
        
      }
     

    //   for(int i=0;i<C.length;i++){
    //     for(int j=0;j<C[0].length;j++){
    //        C [i][j]=sc.nextInt();
            
    //     }
        
    //   }
     
     


      for(int i=0;i<M.length;i++){
        for(int j=0;j<M[i].length;j++){
            C[i][j]=0;
            for(int k=0;k<M.length;k++){
          C[i][j]=C[i][j]+S[i][k]*M[k][j];
        // C[i][j]=S[i][k]*M[k][j]+S[i][k]*M[k][j]+S[i][k]*M[k][j]; wrong way
            }
        }
      }
      for(int i=0;i<M.length;i++){
        for(int j=0;j<M[i].length;j++){
          System.out.print(C[i][j]+" ");
        }
        System.out.println("");
      }
     
     
    }
}