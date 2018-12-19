package jp.co.wintechservice.postCodeSelect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Insertインスタンスで町域名を加工し、必要な情報のみをBeanにセット
 * @author kohari.junichirou
 *
 */
public class PostcodeAndAddress {
    /**
     * Insertインスタンスのinsertメソッドを使う
     * Beanに必要な値をセット
     * @param array
     * @return naniwa 郵便番号と住所（漢字）のインスタンス
     */
    public Oosaka  postcodeAndAddress(String array[]) {
        /**
         * 配列をリストに変換
         */
        List<String>list = new ArrayList<String>();
        list.addAll(Arrays.asList(array));
                        
        /**
         * Beanにセット
         */
        Oosaka naniwa = new Oosaka();
        naniwa.setPostcode(list.get(2));
        naniwa.setPrefecture(list.get(6));
        naniwa.setCity(list.get(7));
        /**
         * 一桁の数字に全角の０を足す        
         */
        String townName = list.get(8);
        naniwa.setTown(townName.replaceFirst("([^０-９])([０-９]{1}[^０-９])","$1０$2"));
        

        return naniwa;
        
        
    }

}
