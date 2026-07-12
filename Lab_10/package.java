// Parent class code :

package mypack;
public class parentClass{
   public void show(){
      System.out.println("This is parent class");
   }
}



// Child Class code : 
import mypack.parentClass;
class childClass extends parentClass{
   public void display(){
      System.out.println("This is child class");
   }


   public static void main(String[] args){
      childClass obj = new childClass();
      obj.show();
      obj.display();
   }
}

