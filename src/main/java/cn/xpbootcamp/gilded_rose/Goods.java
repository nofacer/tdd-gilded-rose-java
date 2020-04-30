package cn.xpbootcamp.gilded_rose;

import lombok.Data;

@Data
public abstract class Goods {

  private String name;
  private long initSellIn;
  private long initQuality;
  private long currentSellIn;
  private long currentQuality;
  private String initDate;

  public Goods(long initSellIn, long initQuality, String initDate) {
    this.initSellIn = initSellIn;
    this.initQuality = initQuality;
    this.currentSellIn = initSellIn;
    this.currentQuality = initQuality;
    this.initDate = initDate;
  }

  public void calSellInOfNewDay(String dateString) {
  }

  public void callQualityOfNewDay() {
  }
}
