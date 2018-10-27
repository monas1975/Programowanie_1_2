import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeCwiczenia {

    public static void main(String[] args){


        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yy");

       System.out.println(printDateTime("2018.04.01"));
    }

    public static String printDateTime(String givenDate){
        DateTimeFormatter givenFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate givenDateObject = LocalDate.parse(givenDate, givenFormatter);
        return LocalDateTime.now().format(formatter);
    }
}
