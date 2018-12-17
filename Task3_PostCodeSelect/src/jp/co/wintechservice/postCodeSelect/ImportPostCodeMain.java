package jp.co.wintechservice.postCodeSelect;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 郵便番号を抽出加工して出力を実行するクラス
 * @author KohariJunichiro
 *
 */

public class ImportPostCodeMain {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */

	public static void main(String[] args)  {

	        //読み込んだ内容を格納するためのリスト
            List<List<Oosaka>> ret = new ArrayList<List<Oosaka>>();
            try {
                String inputFileName =
                     "C:\\\\education\\\\edu-Console\\\\Task3_PostCodeSelect\\\\src\\\\jp\\\\co\\\\wintechservice\\\\postCodeSelect\\\\27OSAKA.csv";
                String outputFileName =
                     "C:\\\\education\\\\edu-Console\\\\Task3_PostCodeSelect\\\\src\\\\jp\\\\co\\\\wintechservice\\\\postCodeSelect\\\\27OSAKA2nd.csv";
                File inputFile = new File(inputFileName);
                File outputFile = new File(outputFileName);
                //文字コードを指定して文字化けを防ぐ
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile),"MS932"));
                PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile),"MS932")));

                //csvファイルから読みこんだデータを格納するString
                String line = "";

                while((line = br.readLine()) != null) {
                    //csvの一行を格納するリスト
                    String[] array = line.split(",");
                    if(!array[7].equalsIgnoreCase("\"大阪市阿倍野区\"")) {
                        continue;
                    }


                    //配列からリストに変換、【removeする前にbeanに詰める】
                    List<String>list = new ArrayList<String>();
                    list.addAll(Arrays.asList(array));
                    list.remove(0); list.remove(0);
                    list.remove(1); list.remove(1);
                    list.remove(1); list.remove(4);
                    list.remove(4); list.remove(4);
                    list.remove(4); list.remove(4);
                    list.remove(4);

                    Oosaka naniwa = new Oosaka();
                    naniwa.setPostcode(list.get(0));
                    naniwa.setPrefecture(list.get(1));
                    naniwa.setCity(list.get(2));
                    naniwa.setTown(list.get(3));

                    List<Oosaka> listOfOosaka = new ArrayList<Oosaka>();
                    listOfOosaka.add(naniwa);

                    //確認のためリストの内容を出力
                    System.out.println(list);
                    //リストに1行データを格納
                    ret.add(listOfOosaka);
                }
                br.close();

                //csvファイルに出力
                for(List<Oosaka> l: ret) {
                    String postcodeString = l.get(0).getPostcode();
                    String prefectureString = l.get(1).getPrefecture();
                    String cityString = l.get(2).getCity();
                    String townString = l.get(3).getTown();
                    String outputLine = postcodeString + "," + prefectureString + "," + cityString + "," + townString + ",";
                    pw.println(outputLine);
                }
                pw.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

	}

}
