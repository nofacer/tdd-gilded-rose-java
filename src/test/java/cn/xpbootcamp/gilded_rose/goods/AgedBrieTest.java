package cn.xpbootcamp.gilded_rose.goods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgedBrieTest {

  private AgedBrie agedBrie;

  @BeforeEach
  void setUp() {
    agedBrie = new AgedBrie(5, 20, "2020-01-01");
  }


  @Test
  public void shouldIncreaseQuality() throws ParseException {
    String newDay = "2020-01-30";
    agedBrie.updateInfo(newDay);

    assertEquals(49, agedBrie.getCurrentQuality());
  }

  @Test
  public void shouldNotLargeThanFiftyForQuality() throws ParseException {
    String newDay = "2020-04-30";
    agedBrie.updateInfo(newDay);

    assertEquals(50, agedBrie.getCurrentQuality());
  }
}
