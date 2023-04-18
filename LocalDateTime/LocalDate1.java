package LocalDateTime;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDate1 {
    public static void main(String[] args) {

//        System.out.println(LocalDateTime.now());
//        var ff = DateTimeFormatter.ofPattern("MMMM dd, yy 'at' hh:mm");
//        System.out.println(Locale.getDefault());
//
//        int attendeesPerYear = 3_200_000;
//        int attendeesPerMonth = attendeesPerYear/12;
//
//        var us = NumberFormat.getInstance(Locale.US);
//        System.out.println(us);

//        double price = 48;
//        var myLocale = NumberFormat.getInstance();
//
//        System.out.println(myLocale.format(price));

//        LocalDate date = LocalDate.parse("2020,04,30",DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//        System.out.println(date.getYear()+ " "+date.getMonth()+" "+date.getDayOfMonth());

        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("Dolphins");
        System.out.println(b.getString("name"));


    }
}
