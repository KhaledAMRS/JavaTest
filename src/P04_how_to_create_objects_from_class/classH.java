package P04_how_to_create_objects_from_class;

public class classH {

    public static void main(String[] args) {
        classG g = new classG();
        System.out.println("sum result:");
        System.out.println(g.sum());

        System.out.println("subtract result:");
        System.out.println(g.subtract());
    }
}
