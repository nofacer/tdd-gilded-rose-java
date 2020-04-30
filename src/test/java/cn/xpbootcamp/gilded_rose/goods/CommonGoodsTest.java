package cn.xpbootcamp.gilded_rose.goods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommonGoodsTest {

  private CommonGoods commonGoods;

  @BeforeEach
  void setUp() {
    commonGoods = new CommonGoods(10, 20, "2020-01-01");
  }

  @Test
  void shouldUpdateInfoCorrectlyBeforeSellIn() throws ParseException {
    commonGoods.updateInfo("2020-01-05");
    assertEquals(16, commonGoods.getCurrentQuality());
    assertEquals(6, commonGoods.getCurrentSellIn());
  }

  @Test
  void shouldUpdateInfoCorrectlyAfterSellIn() throws ParseException {
    commonGoods.updateInfo("2020-01-13");
    assertEquals(6, commonGoods.getCurrentQuality());
    assertEquals(-2, commonGoods.getCurrentSellIn());
  }

  @Test
  void shouldNotLessThanZeroForQuality() throws ParseException {
    commonGoods.updateInfo("2020-01-20");
    assertEquals(0, commonGoods.getCurrentQuality());
    assertEquals(-9, commonGoods.getCurrentSellIn());
  }
}
