public class Except extends java.lang.Exception {
    public Except() {
        super("Factorial Exception: Invalid input");
    }
    public Except(String message) {
        super("Factorial Exception: " + message);
    }
}