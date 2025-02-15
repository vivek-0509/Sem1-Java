import java.util.*;

class cylinde{
  private  double radius;
  private double height;

  double getRadius(){
    return radius;
  }

  double getHeight(){
    return height;
  }

  void setRadius(double r){
    radius=r;
  }

  void setHeight(double h){
    height=h;
  }

   double lidarea(){
    return Math.PI*radius*radius;
  }
  
   double area(){
    return 2*Math.PI*radius*(radius+height);
  }

}



public class cylinder{
   
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
       cylinde my =new cylinde();
       my.setRadius(5.0);
       my.setHeight(5.0);
      System.out.println(my.area());
      System.out.println(my.lidarea());
     }
}


   
