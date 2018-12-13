package jp.co.wintechservice.birthday.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import jp.co.wintechservice.birthday.logic.CalcLogic;




/**
 *
 * コンソールから生年月日を入力し、以下の情報を出力するプログラムを作成せよ。
 * 入力形式はYYYY/MM/DDの形式とし、この形式以外の入力値はエラーとする。
 * 出力情報(○に計算結果を埋め込み、下記文面通りに出力)
 * ・今日はあなたが生まれてから○ヶ月目です。
 * ・今日はあなたが生まれてから○日目です。
 * ・現時刻はあなたが生まれてから○時間です。
 * ・現時刻はあなたが生まれてから○分です。
 * エラー文言
 * ・日付として正しい値を入力してください。
 *
 * 誕生日計算実行クラス
 * @author
 *
 */
public class CalcMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    /**
	     *  生年月日を入力してもらう
	     */
	   LocalDate ld = null;
       Scanner birthdayInput = new Scanner(System.in);
       System.out.println("あなたの生年月日をYYYY/MM/DDの形式で入力して下さい");
       /**
        * YYYY/MM/DDの形式以外の入力値はエラー
        */
       try {
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
           String birthdayString = birthdayInput.nextLine();
           ld = LocalDate.parse(birthdayString, dtf);
           
       } catch (DateTimeParseException e) {
           System.out.println("日付として正しい値を入力してください。");
       }
       CalcLogic cl = new CalcLogic();
       cl.logic(ld);

	}
}
