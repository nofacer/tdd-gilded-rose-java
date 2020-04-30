package cn.xpbootcamp.gilded_rose.goods;

public class AgedBrie extends CommonGoods {


  public AgedBrie(long initSellIn, long initQuality, String initDate) {
    super(initSellIn, initQuality, initDate);
  }

  @Override
  public long calDeltaQuality(long sellIn, long dateDistance) {
    long deltaQuality;
    deltaQuality = 1 * dateDistance;
    return deltaQuality;
  }
}
