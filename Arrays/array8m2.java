import java.util.*;

public class array8m2{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int [] M= new int[N];
    //    int [] S=new int [N];
       for(int i=0;i<M.length;i++){
        M[i]=sc.nextInt();
       }
       
    //    for(int i=0;i<M.length;i++){
    //      S[i]=M[M.length-i-1];
    //    }
     int c=0;
    //  int s=M[0+i];
    //  int l=M[N-1-i];
    for(int i=0;i<M.length/2;i++){
        if(M[i]!=M[M.length-i-1]){   //to reduce iterations we only check till mid point .
            c++;
            break;
        }
      }
    // for(int i=0;i<M.length/2;i++){
    //     if(s!=l){   //to reduce iterations we only check till mid point .
    //         c++;
    //         break;
    //     }
    //   }
      
    //    for(int i=0;i<S.length;i++){   MISTAKE PRINTING AGAIN AND AGAIN
    //     System.out.print(S[i]);
    //   }
      
        // int c=0;
            // for(int i=0;i<M.length;i++){
            //   if(S[i]!=M[i]){
            //   c++;
            //    break;
            //   }
              
            //   }
          
        
       if(c>0){
        System.out.print("no");
       }
       else{
        System.out.print("yes");
       }
            
        
      
       
   }



}
