package cn.xpbootcamp.gilded_rose;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
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

  public static long calDistanceBetweenTwoDateString(String dateStringOld, String dateStringNew)
      throws ParseException {
    Calendar dateOld = convertDateFromString(dateStringOld);
    Calendar dateNew = convertDateFromString(dateStringNew);
    return TimeUnit.DAYS
        .convert(dateNew.getTimeInMillis() - dateOld.getTimeInMillis(), TimeUnit.MILLISECONDS);
  }
}
