import java.util.*;
public class ques2{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
      
      int A[][]=new int [5][5];
      
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                A[i][j]=sc.nextInt();
            }
        }
        
        int a=0;
        int b=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(A[i][j]>0){
                    a=i;
                    b=j;
                    break;
                }
            }
        }

        if(a>=2 && b<=2){
            System.out.println()
        }
    }
}
