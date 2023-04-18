//import java.text.NumberFormat;
//import java.util.Locale;
//import java.util.Locale.Category;
//public class Wallet {
//    private double money;
//    // Assume getters/setters/constructors provided
//
//    private String openWallet() {
//        Locale.setDefault(Category.DISPLAY,
//                new Locale.Builder().setRegion("us"));
//
//        Locale.setDefault(Category.FORMAT,
//                new Locale.Builder().setLanguage("en"));
//        return NumberFormat.getCurrencyInstance(Locale.GERMANY)
//                .format(money);
//    }
//    public void printBalance() {
//        System.out.println(openWallet());
//    }
//    public static void main(String… unused) {
//        new Wallet(2.4).printBalance();
//    }
//}
