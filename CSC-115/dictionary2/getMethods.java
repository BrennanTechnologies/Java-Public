// Java program to demonstrate getMethods() method
  
import java.util.*;
  
class Main {
  
    public Object obj;
    private void function() {}
  
    Main()
    {
  
        class Arr {
        };
  
        obj = new Arr();
    }
  
    public static void main(String[] args)
        throws ClassNotFoundException
    {
        Main t = new Main();
  
        // returns the Class object
        Class myClass = t.obj.getClass();
  
        // Get the methods of myClass
        // using getMethods() method
        System.out.println("Methods of myClass: "
                           + Arrays.toString(
                                 myClass.getMethods()));
    }
}