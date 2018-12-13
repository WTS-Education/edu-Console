package jp.co.wintechservice.jCal.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


/**
 * 古いAPIのバージョン
 * @author kohari.junichirou
 *
 */

public class OldVersion extends Version {
    /**
     * 旧APIで和暦に変換する
     * Versionを継承
     * @throws ParseException
     */
    public void Version() throws ParseException {
       Input ip = new Input();
       /**
        * 条件に合わない入力値はエラー
        */
       try {
           /**
            * Calendarインスタンスにロケールを設定
            */
           Locale jp = new Locale("ja", "JP", "JP");
           Calendar cl = Calendar.getInstance(jp);
           /**
            * 受け付けた文字列を日付に変換
            */
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
           Date date = sdf.parse(ip.input());
           cl.setTime(date);
           /**
            * 1872/12/31以前の場合はエラー
            */
           Calendar past = Calendar.getInstance();
           past.set(1872, 12, 31);
           if (cl.before(past)) {
            throw new IllegalArgumentException("変換対象外の日付です。");
           }
           /**
            * 和暦で出力
            */
           DateFormat japan = new SimpleDateFormat("GGGGy年M月d日", jp);
           String dateStr = japan.format(cl.getTime());
           System.out.println(dateStr +"old");

           /**
            * 不適切な入力はエラー
            */
       } catch (DateTimeParseException e) {
           System.out.println("日付として正しい値を入力してください。");
       }
    }

}
