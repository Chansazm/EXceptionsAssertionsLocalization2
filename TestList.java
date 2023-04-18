import java.util.ArrayList;

public class TestList {

    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<String>();
        testList.add(0, "candy corn");
        testList.add(1, "Milky Way");
        testList.add(2, "Gobstoppers");
        testList.add(1, "Cinnamon Bears");
        testList.remove(1);
        testList.add("Nerds");
        testList.add("Mamba");
        testList.remove(3);
        System.out.println(testList);
    }
}
