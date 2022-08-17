package StrinngArrayListLambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E MMM dd, yyyy G");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("k:m:s A a");

        LocalDate date = LocalDate.now();
        String s = date.format(dateTimeFormatter);

        LocalDateTime dateTime = LocalDateTime.now();
        String time = dateTime.format(timeFormatter);

//        System.out.println(s);
        System.out.println(time);
    }
}
