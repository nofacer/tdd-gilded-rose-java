package cn.xpbootcamp.gilded_rose;

import java.text.ParseException;
import java.util.Calendar;
import lombok.Data;

@Data
public abstract class Goods {

  private String name;
  private long initSellIn;
  private long initQuality;
  private long currentSellIn;
  private long currentQuality;
  private Calendar initDate;

  public Goods(long initSellIn, long initQuality, String initDate) throws ParseException {
    this.initSellIn = initSellIn;
    this.initQuality = initQuality;
    this.currentSellIn = initSellIn;
    this.currentQuality = initQuality;
    this.initDate = WorldDate.convertDateFromString(initDate);
  }

  public void calSellInOfNewDay() {
  }

  public void callQualityOfNewDay() {
  }
}
