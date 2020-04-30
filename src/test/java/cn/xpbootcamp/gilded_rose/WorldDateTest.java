package cn.xpbootcamp.gilded_rose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.Calendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorldDateTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void shouldParseDateFromString() throws ParseException {
    WorldDate worldDate = new WorldDate();
    Calendar calendar = Calendar.getInstance();
    calendar.set(2020, Calendar.APRIL, 30, 0, 0, 0);

    Calendar actualCalendar = WorldDate.convertDateFromString("2020-04-30");

    assertEquals(calendar.getTime().toString(), actualCalendar.getTime().toString());
  }

}
