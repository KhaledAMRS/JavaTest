package P03_what_are_methods;

public class classE {
    // How to define methods and what's void method

   /*
    Access_Modifiers static/not DataType MethodName ()
    {
    // write your code here inside the method
    }
    */


// Examples
    public int anyName1()
    {
        int x = 5+2;
        return x;
    }

    /*
it could also be written by returning the value directly without defining variable like this
  */
    public int anyName2()
    {
        return 5+2;
    }

    public String anyName3()
    {
        return "Hello";
    }

    public boolean anyName4()
    {
        return true;
    }

    // void method: is the method which should not have a return value.

    public void anyName5()
    {
        int x = 4+5;
        String y = "Automation";
        boolean z = false;
// No return to any data type because method type is void
    }
}
