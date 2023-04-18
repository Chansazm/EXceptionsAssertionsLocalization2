import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class AhChoo {
static class SneezeException extends Exception {}
    static class SniffleException extends SneezeException {}
 public static void main(String[] args) throws SniffleException{

     LocalDateTime ldt = LocalDateTime.of(2020, 5, 10, 11, 22, 33);
     var f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
     System.out.println(ldt.format(f));


 }
}

