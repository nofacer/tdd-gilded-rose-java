package cn.xpbootcamp.gilded_rose.goods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SulfurasTest {

  private Sulfuras sulfuras;

  @BeforeEach
  void setUp() {
    sulfuras = new Sulfuras(5, 20, "2020-01-01");
  }


  @Test
  public void shouldNotChangeQuality() throws ParseException {
    String newDay = "2020-01-30";
    sulfuras.updateInfo(newDay);

    assertEquals(20, sulfuras.getCurrentQuality());
  }
}
