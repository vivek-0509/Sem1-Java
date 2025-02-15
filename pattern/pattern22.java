import java.util.*;
class pattern22{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int T=sc.nextInt();

    for(int a=0;a<T;a++){
        int N=sc.nextInt();
    for(int m=0; m<2*N-1;m++){
        for(int s=0;s<2*N-1;s++){
            int top =m;
            int left=s;
            int right=(2*N-2)-s;
            int down =(2*N-2)-m;
            System.out.print(N-Math.min(Math.min(top,left),Math.min(right,down))+" ");
            
        }
        System.out.println("");
        }
    }

     
    }
}       

