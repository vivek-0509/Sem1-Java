import java.util.*;
class  Prime3{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int a=A;
    int m=2;
    int s=0;
    while(a>=A && a<B){
      while(m<A){
       if(a%m==0){
          s=m;

	     }
          m++;
}
	   a++;
   
  }
  if(s==0){
System.out.println(a);
}


    }




}
