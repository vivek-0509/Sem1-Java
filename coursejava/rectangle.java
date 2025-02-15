import java.util.*;

class rectangl{
  private int length;
  private int breath;

   int getlength(){
    return length;
   }

   void setlength(int l){
    length=l;
   }  

   int getbreath(){
    return breath;
   }

   void setbreath(int b){
    breath=b;
   }
   
   int area(){
    return length*breath;
  }
  
   int perimeter (){
    return 2*breath+2*length;
  }

}



public class rectangle{
   
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
       rectangl my =new rectangl();
       my.setlength(5);
       my.setbreath(5);
      System.out.println(my.area());
      System.out.println(my.perimeter());
     }
}


