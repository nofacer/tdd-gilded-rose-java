package cn.xpbootcamp.gilded_rose.goods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import org.junit.jupiter.api.Test;

class BackstagePassTest {

  @Test
  void shouldBeZeroQualityIfOverShowDate() throws ParseException {
    BackstagePass backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-01-5");
    backstagePass.updateInfo("2020-01-31");
    assertEquals(0, backstagePass.getCurrentQuality());
  }

  @Test
  void shouldGetQualityWhenInitShowDateLessThan5Days() throws ParseException {
    BackstagePass backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-01-6");
    backstagePass.updateInfo("2020-01-6");
    assertEquals(35, backstagePass.getCurrentQuality());
  }

  @Test
  void shouldGetQualityWhenInitShowDateBetween5And10DaysAndMoreThan5DaysToShow() throws ParseException {
    BackstagePass backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-01-11");
    backstagePass.updateInfo("2020-01-6");
    assertEquals(30, backstagePass.getCurrentQuality());
  }

  @Test
  void shouldGetQualityWhenInitShowDateBetween5And10DaysAndLessThan5DaysToShow() throws ParseException {
    BackstagePass backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-01-11");
    backstagePass.updateInfo("2020-01-11");
    assertEquals(45, backstagePass.getCurrentQuality());
  }

  @Test
  void shouldGetQualityWhenInitShowDateLargerThan10DaysAndMoreThan5DaysToShow() throws ParseException {
    BackstagePass backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-01-20");
    backstagePass.updateInfo("2020-01-10");
    assertEquals(29, backstagePass.getCurrentQuality());
  }

  @Test
  void shouldGetQualityWhenInitShowDateLargerThan10DaysAndBetween10And5DaysToShow() throws ParseException {
    BackstagePass backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-01-20");
    backstagePass.updateInfo("2020-01-15");
    assertEquals(39, backstagePass.getCurrentQuality());
  }

  @Test
  void shouldGetQualityWhenInitShowDateLargerThan10DaysAndLessThan5DaysToShow() throws ParseException {
    BackstagePass backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-01-20");
    backstagePass.updateInfo("2020-01-17");
    assertEquals(45, backstagePass.getCurrentQuality());
  }

  @Test
  void shouldNotLargerThan50ForQuality() throws ParseException {
    BackstagePass backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-03-30");
    backstagePass.updateInfo("2020-03-30");
    assertEquals(50, backstagePass.getCurrentQuality());
  }
}
