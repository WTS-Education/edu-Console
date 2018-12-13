package jp.co.wintechservice.jCal.main;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


/**
 * 新しいAPIのバージョン
 * @author kohari.junichirou
 *
 */
public class NewVersion extends Version {
    /**
     * 新APIで和暦に変換する
     * Versionを継承
     * @throws ParseException
     */
    public void Version() {       
       LocalDate ld = null;
       Input ip = new Input(); 
       /**
        * 条件に合わない入力値はエラー
        */
       try {
           /**
            * 受け付けた文字列を日付に変換
            */
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");           
           ld = LocalDate.parse(ip.input(), dtf);
           /**
            * 1872/12/31以前の場合はエラー
            */
           LocalDate past = LocalDate.of(1872, 12, 31);
           if (ld.isBefore(past)) {
            throw new IllegalArgumentException("変換対象外の日付です。");
           }
           /**
            * 和暦で出力
            */
           JapaneseDate jd = JapaneseDate.of(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth());
           DateTimeFormatter jdtf = DateTimeFormatter.ofPattern("Gyy年M月d日");
           System.out.println(jd.format(jdtf) + "new");
           /**
            * 不適切な入力はエラー
            */
       } catch (DateTimeParseException e) {
           System.out.println("日付として正しい値を入力してください。");
       }
    }
}
