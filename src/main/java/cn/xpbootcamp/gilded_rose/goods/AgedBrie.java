package cn.xpbootcamp.gilded_rose.goods;

import cn.xpbootcamp.gilded_rose.Goods;
import cn.xpbootcamp.gilded_rose.WorldDate;
import java.text.ParseException;
import lombok.Data;

@Data
public class AgedBrie implements Goods {

  private String name;
  private long initSellIn;
  private long initQuality;
  private long currentSellIn;
  private long currentQuality;
  private String initDate;

  public AgedBrie(long initSellIn, long initQuality, String initDate) {
    this.initSellIn = initSellIn;
    this.initQuality = initQuality;
    this.initDate = initDate;
  }


  @Override
  public void updateInfo(String newDateString) throws ParseException {
    calSellInOfNewDay(newDateString);
    callQualityOfNewDay(newDateString);
  }

  @Override
  public void calSellInOfNewDay(String dateString) throws ParseException {
    long dateDistance = WorldDate.calDistanceBetweenTwoDateString(this.initDate, dateString);
    this.currentSellIn = this.initSellIn - dateDistance;
  }

  @Override
  public void callQualityOfNewDay(String dateString) throws ParseException {
    long dateDistance = WorldDate.calDistanceBetweenTwoDateString(this.initDate, dateString);
    this.currentQuality = initQuality + calDeltaQuality(this.initSellIn, dateDistance);
    this.currentQuality = this.currentQuality < 0 ? 0 : this.currentQuality;
  }

  @Override
  public long calDeltaQuality(long sellIn, long dateDistance) {
    long deltaQuality;
    deltaQuality = 1* dateDistance;
    return deltaQuality;
  }
}