import java.util.Locale;
public class ReadMap implements AutoCloseable {
    private Locale locale;
    private boolean closed = false;
    void check() {
        assert !closed;
    }
    @Override
    public void close() {
        check();
        System.out.println("Folding map");

        locale = null;
        closed = true;
    }
    public void open() {
        check();
        this.locale = new Locale("en","US");
    }
    public void use() {
        // Implementation omitted
    }

    public static void main(String[] args) {
        ReadMap read = new ReadMap();
        boolean red = read.closed;
        System.out.println(red);
    }
}


