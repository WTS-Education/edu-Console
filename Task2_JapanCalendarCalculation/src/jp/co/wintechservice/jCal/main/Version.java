package jp.co.wintechservice.jCal.main;

import java.time.format.DateTimeParseException;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * OldVersion,NewVersionのスーパークラス
 * @author kohari.junichirou
 *
 */
public abstract class Version {
    
    public void version() throws ParseException {
        /**
         * Inputクラスをインスタンス化
         */
        Input ip = new Input();
        /**
         * 例外処理
         */
        try {
            System.out.println("");
        } catch (DateTimeParseException e) {
            System.out.println("日付として正しい値を入力してください");
        }
    } 

}
