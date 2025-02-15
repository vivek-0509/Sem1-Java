import java.util.*;
class pattern21{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
      int[] M= new int [10];

      for(int i=0; i<10;i++){
        M[i]=sc.nextInt();
      }

     int sum=0;
     for(int i=0;i<10;i++){
        sum=sum+i;
     }
     
     double avg=sum/10;
     System.out.print(sum);
    }
} 