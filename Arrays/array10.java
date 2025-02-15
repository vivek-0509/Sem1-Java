import java.util.*;

class array10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] M = new int[N];

        for (int i = 0; i < M.length; i++) {
            M[i] = sc.nextInt();
        }
        
        int k=sc.nextInt();
       int l=0;
        for (int i = 0; i < M.length; i++) {
            int c=k-M[i];
            for (int s = 0; s < M.length; s++) {  //start s form c to reduce iterations.
               if(c==M[i]){
                  l++;  
                  break;
               }
                if(l>0){
                    break;//to reduce iterations.   //not compulsory to write bu to reduce time.
                }
            }
        }

        if(l>0){
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }
        
    

    }
}