public class EnterPark extends Exception {
    public EnterPark(String message) {
        super();
    }
    private static void checkInput(String[] v) {
        if (v.length <= 3)
            assert(false) : "Invalid input";
    }
    public static void main(String[] args) {
        checkInput(args);
        System.out.println(args[0] + args[1] + args[2]);
    }
}
