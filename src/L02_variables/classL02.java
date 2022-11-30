package L02_variables;

public class classL02 {

// What's variables, Type of variables, how to define variables.
// Variables are the names you give to computer memory locations which are used to store values in a computer program.

    /*
Type of variables

 int: It's used to store whole numbers that can be positive, negative, or zero.
 double: used to represent floating-point numbers like 2.5
 char: It is a data type that is used to store a single character and should be surrounded by single quotes ''
 String: used for storing text and should be surrounded by double quotes ""
 boolean: It is a primitive data type that is used to represent a single true/false value. it's used to compare two values like actual/expected result


- Notes:
    * S should be capital when defining String unlike other variables like int, char, boolean, double
    * if the variable is String then value should be written between ""
      but if the variable is char then value should be ''
      and for other variables the values are written without "" or ''
    * Don't forget ; at the end of any variable

     */


  public static   int a = 5;
    double e = 2.5;
    char b = 'z';
    String c = "text";
    boolean d = true;      // or false


    /*
    Types of Access_Modifiers available for variables

     1- Default: will be available for any other class in the same package but not available for other packages  >> use import to explain this
     2- public: declared public can be accessed from any other class.
     3- private: only accessible within the declared class.
     there might be other Access_Modifiers for variables but that's enough for now


     */


    /*
        Access_Modifiers static/not  DataType VariableName = Value;

        Note: We will discuss static later.
     */

}

