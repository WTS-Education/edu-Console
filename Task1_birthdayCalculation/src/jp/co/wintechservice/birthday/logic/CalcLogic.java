package jp.co.wintechservice.birthday.logic;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * 誕生日計算の計算ロジック
 * @author
 *
 */
public class CalcLogic {

    public void logic (LocalDate ld) {
        /**
         * 時間、分の間隔
         */
        LocalDateTime birthday = ld.atTime(00, 00, 00);
        LocalDateTime today = LocalDateTime.now();
        Duration hourAndMinute = Duration.between(birthday, today);
        long hour = hourAndMinute.toHours();
        long minute = hourAndMinute.toMinutes();
        
        /**
         * 月、日の間隔
         */
        LocalDate todayld = today.toLocalDate();
        Period monthAndDay = Period.between(ld, todayld);
        int year = monthAndDay.getYears();
        int month = year * 12 + monthAndDay.getMonths();
        long day = hour /24;

        System.out.println("今日はあなたが生まれてから" + month + "ヶ月目です。");
        System.out.println("今日はあなたが生まれてから" + day + "日目です。");
        System.out.println("現時刻はあなたが生まれてから" + hour + "時間です。");
        System.out.println("現時刻はあなたが生まれてから" + minute + "分です。");
    }

}
