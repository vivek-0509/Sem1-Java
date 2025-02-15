import java.util.*;
public class pascal{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
         int nums[]=new int [N];
    int k=3;

         for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
         }
        //  for(int i=0;i<N;i++){
        //     for(int j=0;j<N-1-i;j++){
        //         System.out.print(" ");
        //     }
        //     int number =1;
        //     for(int j=0;j<=i;j++){
            
        //         System.out.print(number+" ");
        //         number=number*(i-j)/(j+1);
        //     }
        //     System.out.println();
        //  }

        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[i];
                     if(sum==k){
                           c++;
                     }
            }
        }
        
        
            System.out.print(c);
         
    }
}




