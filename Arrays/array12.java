import java.util.*;

class array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] M = new int[N];

        for (int i = 0; i < M.length; i++) {
            M[i] = sc.nextInt();
        }
        
        
       int c=0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) { 
                for(int s=0;s<M.length;s++){
                if((M[i]+M[j]+M[s])%2==0 && i!=j && j!=s && s!=i){
                    c++;
                    
                   
                }
            }

            }
       
    
        }
        // if(c>0){
        //     System.out.println(c);

        // }                                     //either add conditiond as i+1;j+1 //to reduce some itertions
        // else{
        //     System.out.println("0");
        // }
        System.out.println(c/6);
    }
}