package P05_how_to_pass_values_while_creating_objects;

public class classEA {

   static int x = 5;

    public static int v()
    {
        int y = 5+2;
        return y;
    }


    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(v());
        System.out.println(x+v());
    }


}
