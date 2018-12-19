package jp.co.wintechservice.postCodeSelect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * csvファイルを読み込んでBean型のリストに格納するクラス
 * @author kohari.junichirou
 *
 */
public class Input {
    /**
     * csvファイルを読み込んでBean型のリストに格納
     * @param inputFileName
     * @return listOfOosaka
     */
    public List<Oosaka> input(String inputFileName) {
        BufferedReader br = null;
      //Beanオブジェクト型のリストを作成
        List<Oosaka> listOfOosaka = new ArrayList<Oosaka>();
        try {
            File inputFile = new File(inputFileName);
            //文字コードを指定して文字化けを防ぐ
            br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile),"MS932"));

            //csvファイルから読みこんだデータを格納するString
            String line = "";



            while((line = br.readLine()) != null) {
                //csvの一行を格納するリスト
                String[] array = line.split(",");


                  //阿倍野区のデータを抽出
                   if(!array[7].equalsIgnoreCase("\"大阪市阿倍野区\"") ) {
                       continue;
                   }



                /**
                 * 阿倍野区のデータのうち、
                 * 郵便番号（現在）と住所（漢字）を抽出
                 * 郵便番号を昇順にソート
                 */
                PostcodeAndAddress paa = new PostcodeAndAddress();

                /**
                 * Beanをリストに格納
                 */
                listOfOosaka.add(paa.postcodeAndAddress(array));


            }
            Sort s = new Sort();
            s.sort(listOfOosaka);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
        }
        return listOfOosaka;

    }

}
