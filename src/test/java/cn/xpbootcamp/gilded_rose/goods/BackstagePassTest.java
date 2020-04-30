package cn.xpbootcamp.gilded_rose.goods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BackstagePassTest {

  private BackstagePass backstagePass;


  @BeforeEach
  void setUp() {
    backstagePass = new BackstagePass(5, 20, "2020-01-01", "2020-01-30");
  }

  @Test
  void shouldBeZeroQualityIfOverShowDate() throws ParseException {
    backstagePass.updateInfo("2020-01-31");
    assertEquals(0, backstagePass.getCurrentQuality());
  }

  @Test
  void shouldIncreaseQualityBy1WhenMoreThan10DaysToShow() throws ParseException {
    backstagePass.updateInfo("2020-01-20");
    assertEquals(39, backstagePass.getCurrentQuality());
  }

}
