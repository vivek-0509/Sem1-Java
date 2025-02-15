import java.util.*;
class pattern21{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
      int[] M= new int [10];

      for(int i=0; i<M.length;i++){
        M[i]=sc.nextInt();
      }

     int sum=0;
     for(int i=0;i<M.length;i++){
        sum=sum+i;
     }
     
     double avg=(double)sum/M.length;
     System.out.print(avg);
    }
} 