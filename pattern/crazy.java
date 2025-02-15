import java.util.*;
class crazy{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();
    
    int a=1;
      for(int i=1;i<=N;i++){
         for(int j=N-1-i;j>0;j--){
            System.out.print(" ");
         }

         for(int j=0;j<2*i-1;j++){
            if(j==0){
               System.out.print("1");
            }
            
            for(int k=0;k<2*i-1 && i!=1;k++){
               if(k%2==0){
                System.out.print(" ");
               }
               if(k%2!=0){
                System.out.print(a);
               }
            }

            if(j==2*i-2){
                System.out.print("1");
            }
            a++;
         }
    }





    }

 }
      

