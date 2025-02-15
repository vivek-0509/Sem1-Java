import java.util.*;
class leet{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     
      int N=sc.nextInt();
      int [] nums=new int[N];
   
      for(int i=0;i<nums.length;i++){
        nums[i]   = sc.nextInt();
      }

      for(int k=0;k<nums.length-1;k++){
        if(nums[k]!=nums[k+1]){
             if(nums[k]<nums[k+1]){
             for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    System.out.print("false");
                    break;
                }
             }
         }

         else{
             for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    System.out.print("false");
                    break;
                }
             }
         }
         break;
       
        }
       }
     System.out.print("true");
    }
}