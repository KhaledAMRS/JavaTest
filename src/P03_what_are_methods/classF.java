package P03_what_are_methods;

public class classF {

    // special method: static void main
/*
It is the most important Java method.
    * the method from where the program starts its execution.
    * It's very important to know that anything is noth written inside this method, it will not be executed
 */
    public static void main(String[] args) {
        System.out.println("First program");

    }


    public void test()
    {
        System.out.println("Second program");
    }
// if you don't call test() method inside static void main method, then "Second program" will not be printed
// another important info, as long as main() method is static, so any method will be called inside should be static as well

}
