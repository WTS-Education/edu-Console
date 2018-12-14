package jp.co.wintechservice.postCodeSelect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import jp.sf.orangesignal.csv.manager.CsvEntityManager;


/**
 * 郵便番号を抽出加工して出力を実行するクラス
 * @author
 *
 */

public class ImportPostCodeMain {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 */
   
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
	    
	    
	    FileReader f = new FileReader("C:\\education\\edu-Console\\Task3_PostCodeSelect\\src\\jp\\co\\wintechservice\\postCodeSelect\\27OSAKA.csv");       
        BufferedReader br = new BufferedReader(f);
        
        try {
            List<Oosaka> list = new CsvEntityManager().load(Oosaka.class).from(br);
            for(Oosaka value : list)
            {
                System.out.println(value);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

	        
	        
	}

}
