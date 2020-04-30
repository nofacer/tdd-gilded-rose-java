package cn.xpbootcamp.gilded_rose.goods;

public class Sulfuras extends CommonGoods {


  public Sulfuras(long initSellIn, long initQuality, String initDate) {
    super(initSellIn, initQuality, initDate);
  }

  @Override
  public long calDeltaQuality(long sellIn, long dateDistance) {
   return 0;
  }
}
