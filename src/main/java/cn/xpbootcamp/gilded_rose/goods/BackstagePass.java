package cn.xpbootcamp.gilded_rose.goods;

import cn.xpbootcamp.gilded_rose.WorldDate;
import java.text.ParseException;

public class BackstagePass extends CommonGoods {

  private String showDate;

  public BackstagePass(long initSellIn, long initQuality, String initDate, String showDate) {
    super(initSellIn, initQuality, initDate);
    this.showDate = showDate;
  }

  @Override
  public long calDeltaQuality(long sellIn, long dateDistance) throws ParseException {
    long daysToShow = WorldDate.calDistanceBetweenTwoDateString(this.getInitDate(), this.showDate);
    if (dateDistance > daysToShow) {
      return -this.getInitQuality();
    }

    if (daysToShow <= 5) {
      return dateDistance * 3;
    }

    if (daysToShow <= 10) {
      if (daysToShow - dateDistance >= 5) {
        return 2 * dateDistance;
      } else {
        return 2 * (daysToShow - 5) + 3 * (dateDistance - (daysToShow - 5));
      }
    }

    if (daysToShow > 10) {
      if (daysToShow - dateDistance >= 10) {
        return dateDistance * 1;
      }
      if (daysToShow - dateDistance < 10 && daysToShow - dateDistance >= 5) {
        return (daysToShow - 10) + 2 * (dateDistance - (daysToShow - 10));
      }
      if (daysToShow - dateDistance < 5) {
        return (daysToShow - 10) + 2 * 5 + 3 * (dateDistance - (daysToShow - 5));
      }
    }
    return 0;
  }
}
