package jp.co.wintechservice.jCal.main;

import java.util.Scanner;

/**
 * 適当な日付を入力してもらう
 * @author kohari.junichirou
 *
 */
public class Input {
    /**
     * 入力した日付を返す
     * @return
     */
    public String input() {
        Scanner dateInput = new Scanner(System.in);
        System.out.println("適当な日付をYYYY/MM/DDの形式で入力して下さい");
        String dateString = dateInput.nextLine();
        return dateString;
    }

}
