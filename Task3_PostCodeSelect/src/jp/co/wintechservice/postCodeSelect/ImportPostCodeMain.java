package jp.co.wintechservice.postCodeSelect;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;




/**
 * 郵便番号を抽出加工して出力を実行するクラス
 * @author KohariJunichiro
 *
 */

public class ImportPostCodeMain {

	/**
	 * Inputクラスのinputメソッドに27OOSAKA.csvのパスを渡し、
	 * 返されたlistOfOosaka(OosakaBeanを格納)と27OOSAKA2nd.csv(新規作成)の
	 * パスをOutputクラスのoutputメソッドに渡して出力
	 * @param args
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args)  {
	                 
        String inputFileName =
             "C:\\\\education\\\\edu-Console\\\\Task3_PostCodeSelect\\\\src\\\\jp\\\\co\\\\wintechservice\\\\postCodeSelect\\\\27OSAKA.csv";
        String outputFileName = args[0];
        
        List<Oosaka> listOfOosaka = new ArrayList<Oosaka>();
        Input ip = new Input();
        listOfOosaka = ip.input(inputFileName);
        
        //テスト
        for(Oosaka o : listOfOosaka) {
            System.out.print(o.getPostcode() + " ");
            System.out.println(o.getPrefecture());
            System.out.print(o.getCity() + " ");
            System.out.println(o.getTown());
        }
        Output op = new Output();
        try {
            op.output(outputFileName, listOfOosaka);
        } catch (IOException e) {
            e.printStackTrace();
        }
           
	}

}
