package cn.xpbootcamp.gilded_rose;

import java.text.ParseException;

public interface Goods {

  void updateInfo(String newDateString) throws ParseException;

  void calSellInOfNewDay(String dateString) throws ParseException;

  void callQualityOfNewDay(String dateString) throws ParseException;

  long calDeltaQuality(long sellIn, long dateDistance);
}
