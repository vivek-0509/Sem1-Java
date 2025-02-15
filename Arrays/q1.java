// import java.util.*;
// public class q1{
//     public static void main(String[] args){
//         Scanner sc=new Scanner (System.in);
//         int T=sc.nextInt();
         
//        for(int a=0;a<T;a++){
//         int N=sc.nextInt();
//          int M=sc.nextInt();
//          int r1=sc.nextInt();
//          int r2=sc.nextInt();

       
//         int v=Math.max(r1,r2);
//         int l=Math.min(r1,r2);
//         int X=v-l-1;
        
        

//         if(N>=2*v+1 && M>=2*l+2*v+2){
//              System.out.println(2*l+2+l+1+2*v+l+2);
//         }
//        else if(X>=l && N>=2*v+1){
//             System.out.println(2*v+2+2*l+2);
//         }

//         else if(M>=v+l+2+2*l+2 && N>=2*v+1){
//             System.out.println(v+2*l+4);,m
//         }
//         else{
//             System.out.println("-1");
//         }
//     }
// }
// }

import java.util.*;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T>0){
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int big_one_radius = Math.max(r1,r2);
            int small_one_radius = Math.min(r1,r2);
            int space_left_after_big_one = big_one_radius - small_one_radius ;

            if(n>=2*big_one_radius+1 && m>=2*small_one_radius+2*big_one_radius+2){
                             System.out.println(2*small_one_radius+2+small_one_radius+1+2*big_one_radius+small_one_radius+2);
                        }
            
            else if (space_left_after_big_one > 2*small_one_radius+2){
                System.out.println(2*r1+2+2*r2+2);
            }
            else {
                if(2*big_one_radius+1>n || (big_one_radius + 1 + small_one_radius + 1 + small_one_radius+1 +small_one_radius)>m){
                    System.out.println(-1);
                }
                else{
                System.out.println(2*big_one_radius+2 +(big_one_radius + 1 + small_one_radius + 1 + small_one_radius+1)+ small_one_radius+1);
                }
            }
            T--;
        }
    }
}
