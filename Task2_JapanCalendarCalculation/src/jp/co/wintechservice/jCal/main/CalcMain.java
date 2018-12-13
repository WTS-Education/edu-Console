package jp.co.wintechservice.jCal.main;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * コンソールから適当な日付を入力し、入力された日付を和暦に変換し出力するプログラムを作成せよ。
 * 入力形式はYYYY/MM/DDの形式とする。
 * ただし、下記条件の場合はエラーとしエラー文言を出力すること。
 * ・1872/12/31以前の場合
 * エラー文言：変換対象外の日付です。
 * ・日付として不適切な文字列
 * エラー文言：日付として正しい値を入力してください。
 *
 *
 * 和暦計算を実行するクラス
 * @author kohari.junichirou
 * @see Input,OldVersion,NewVersion
 *
 */
public class CalcMain {
    /**
     * 新旧どちらのAPIを使うはランダム
     */
    public static void main(String[] args) throws ParseException {
        
        try {
            System.out.println("0か1を入力してください。0:旧API、1:新API");
            Scanner s = new Scanner(System.in);
            int which = s.nextInt();
            if (which > 1) {
                throw new IllegalArgumentException("範囲外です");
            }
            switch (which) {
                /**
                 * 旧バージョン
                 */
                case 0:
                    OldVersion oldv = new OldVersion();
                    oldv.Version();
                    break;
                 /**
                  * 新バージョン
                  */
                case 1:
                    NewVersion newv = new NewVersion();
                    newv.Version();
                    break;
            }
        }catch (InputMismatchException e) {
            System.out.println("エラーが発生しました");
        }


    }

}