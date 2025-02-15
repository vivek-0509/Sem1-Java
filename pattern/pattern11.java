import java.util.*;
class pattern11{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int N=sc.nextInt();

     for(int a=0;a<=N ;a++){
        if(a%2==0){
          for( int m=0 ;m<a; m++){
           if(m%2==0){
            System.out.print("0");
           }
           else{
            System.out.print("1");
           }
          }
        
        }

        

         else if(a%2!=0){
            for( int s=0 ;s<a; s++){
                if(s%2==0){
                 System.out.print("1");
                }
                else{
                 System.out.print("0");
                }
               }
        }

        System.out.println("");
     }
   

    }
}       