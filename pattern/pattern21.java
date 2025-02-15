import java.util.*;
class pattern21{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
     int T=sc.nextInt();

    for(int a=0;a<T;a++){
        int N=sc.nextInt();
    for(int m=1; m<=2*N-1;m++){
        for(int s=1;s<=2*N-1;s++){
            int top =m;
            int left=s;
            int right=2*s-1;
            int down =2*m-1;
            System.out.print(Math.min(Math.min(top,left),Math.min(right,down)));
        }
        System.out.println("");
        }
    }

     
    }
}       
