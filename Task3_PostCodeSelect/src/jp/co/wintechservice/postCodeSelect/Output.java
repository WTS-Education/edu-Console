package jp.co.wintechservice.postCodeSelect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 * 加工したデータを別ファイルに出力する
 * @author kohari.junichirou
 *
 */
public class Output {
    /**
     * 加工したデータを別ファイルに出力する
     * @param outputFileName
     * @param listOfOosaka
     * @throws IOException
     */
    public void output(String outputFileName,List<Oosaka> listOfOosaka) throws IOException {
        PrintWriter pw = null;
        
        try {
            File outputFile = new File(outputFileName);
            /**
             * 文字コードを指定して文字化けを防ぐ
             */
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile,true),"MS932")));
          /**
           * csvファイルに出力
           */
            for(Oosaka o: listOfOosaka) {
                String postcodeString = o.getPostcode();
                String prefectureString = o.getPrefecture();
                String cityString = o.getCity();
                String townString = o.getTown();
                String outputLine = postcodeString + "," + prefectureString + "," + cityString + "," + townString + ",";
                pw.print(outputLine);
                pw.println();
                pw.flush();
            }
        } catch (Exception e) {
        } finally {
            pw.close();
            
        }
    }

}
