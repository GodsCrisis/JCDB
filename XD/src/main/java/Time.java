import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public String time(){
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("H:mm:ss");
        LocalTime time = LocalTime.now();
        String time2=time.format(parseFormat);
        time2="'"+time2+"'";
        return time2;
    }
}
