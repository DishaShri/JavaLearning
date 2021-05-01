package overloading_main;

/**
 * Can we overload the main method?
 * The answer is Yes.
 * Find the implementation below.
 */
public class YesWeCanOverloadMainMethod {

    public static void main(String[] args) {
        System.out.println("Hello");
        YesWeCanOverloadMainMethod overloadingMain = new YesWeCanOverloadMainMethod();
        overloadingMain.main();
    }

    void main() {
        System.out.print("Overloading main");
    }
}
