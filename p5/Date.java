import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;;


public class Date {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println(myDate+"\n");
        DateTimeFormatter myDFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fordataString = myDate.format(myDFormatter);
        System.out.println(fordataString+"\n");


        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);
    }
    
}
