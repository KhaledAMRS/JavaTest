package L03_methods;

public class classA {
    // How to define methods

   /*
    Access_Modifiers static/not DataType MethodName ()
    {
    // write your code here inside the method
    // return statement
    }
    */

    public int a()
    {
        int y = 5+2;
        return y;
        //    Note: y is a variable defined on method level
    }


    //Different phases of methods

  // 1- void method: is the method which should not have a return value.
    public void b()
    {
        int x = 5+2;
        // No return to any data type because method type is void
    }

  //2- constructor method: it's a method without return type and should take class name
  // It's the first thing called when creating an object from this class.
  public classA()
  {

  }

    //3- static void main
    /*
    * the method from where the program starts its execution.
    * It's very important to know that anything is noth written inside this method, it will not be executed
 */
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

}
