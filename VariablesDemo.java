// package second_variables;
public class VariablesDemo {

    // datetype varname = value;
    // if we define variable in class we call them as instance variables
    static int someData1; // declaration
    static double someData2; // declaration
    static char someData3; // declaration
    static boolean someData4; // declaration
    short price = 350;
    char textbrand = 'h';
    String brand = "HIGHLANDER";
    String description = "Men Slim Fit Horizontal Stripes Cotton Casual Shirt";
    float ratings = 4.2f;
    double ratings_new = 4.2;
    // textbrand = HIGHLANDER;
    // description = Men Slim Fit Horizontal Stripes Cotton Casual Shirt;
    // decimal ratings = 4.2
    
    public static void main(String[] args) {
        // if we define variable in methods we call them as local variables
        int someDataNew1 = 10; // initilization
        int someDataNew2; // declaration
        System.out.println(someDataNew1);
        // System.out.println(someDataNew2);

        // work with instance variable
        System.out.println(someData1);
        System.out.println(someData2);
        System.out.println(someData3);
        System.out.println(someData4);
    }
}
