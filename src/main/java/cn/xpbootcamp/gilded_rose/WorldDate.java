package cn.xpbootcamp.gilded_rose;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import lombok.Data;

@Data
public class WorldDate {
  public static Calendar convertDateFromString(String dateString) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = simpleDateFormat.parse(dateString);

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    return calendar;
  }
}
