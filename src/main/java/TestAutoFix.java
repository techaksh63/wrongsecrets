public class TestAutoFix {
    private String name = "Aksh";   // can be final
    private int value = 42;         // can be final

    public void sayHello() {
        if (true) {                 // redundant if
            System.out.println("Hello");
        }
    }
}
