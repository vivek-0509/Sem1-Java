import java.util.*;

public class ques{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       long A=sc.nextInt();
       long min=0;
       for(long i =1;i<=A;i++){
           if(i*i==A){
            min=i;
       
           }

       }
       if(min>0){
           System.out.print(min);
       }
       else{
        System.out.print(-1);
       }

       
    }
}

