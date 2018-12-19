package jp.co.wintechservice.postCodeSelect;


import java.io.Serializable;

/**
 * javaBeanクラス
 * @author KohariJunichiro
 *
 */
public class Oosaka implements Serializable {

    /**
     * 全国地方公共団体コード
     */
    private String code;
    /**
     * 旧郵便番号
     */
    private String oldPost;

    /**
     * 郵便番号（対象）
     */
    private String postcode;

    /**
     * 住所フリガナ
     */
    String prefectureHurigana;
    String cityHurigana;
    String townHurigana;

    /**
     * 住所漢字（対象）
     */
    private String prefecture;
    private String city;
    private String town;

    /**
     * 9.一町域が二以上の郵便番号で表される場合の表示（「1」は該当、「0」は該当せず）
     * 10.小字毎に番地が起番されている町域の表示（「1」は該当、「0」は該当せず）
     * 11.丁目を有する町域の場合の表示（「1」は該当、「0」は該当せず）
     * 12.一つの郵便番号で二以上の町域を表す場合の表示（「1」は該当、「0」は該当せず）
     * 13.更新の表示（「0」は変更なし、「1」は変更あり、「2」廃止（廃止データのみ使用））
     * 14.変更理由（「0」は変更なし、「1」市政・区政・町政・分区・政令指定都市施行、
     *    「2」住居表示の実施、「3」区画整理、「4」郵便区調整等、「5」訂正、「6」廃止（廃止データのみ使用））
     */
    private String postcodePattern;
    private String koaza;
    private String tyoume;
    private String complexPostcode;
    private String update;
    private String change;

    public Oosaka() {}

    public Oosaka(String code, String oldPost, String postcode, String prefectureHurigana,
                   String cityHurigana, String townHurigana, String prefecture, String city,
                   String town, String postcodePattern, String koaza, String tyoume,
                   String complexPostcode, String update) {
        this.code = code;
        this.oldPost = oldPost;
        this.postcode = postcode;
        this.prefectureHurigana = prefectureHurigana;
        this.cityHurigana = cityHurigana;
        this.townHurigana = townHurigana;
        this.prefecture = prefecture;
        this.city = city;
        this.town = town;
        this.postcodePattern = postcodePattern;
        this.koaza = koaza;
        this.tyoume = tyoume;
        this.complexPostcode = complexPostcode;
        this.update = update;
    }
    
    

    /**
     * getter,setter
     * @return
     */
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getOldPost() {
        return oldPost;
    }
    public void setOldPost(String oldPost) {
        this.oldPost = oldPost;
    }

    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPrefectureHurigana() {
        return prefectureHurigana;
    }
    public void setPrefectureHurigana(String prefectureHurigana) {
        this.prefectureHurigana = prefectureHurigana;
    }

    public String getCityHurigana() {
        return cityHurigana;
    }
    public void setCityHurigana(String cityHurigana) {
        this.cityHurigana = cityHurigana;
    }

    public String getTownHurigana() {
        return townHurigana;
    }
    public void setTownHurigana(String townHurigana) {
        this.townHurigana = townHurigana;
    }



    public String getPrefecture() {
        return prefecture;
    }
    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcodePattern() {
        return postcodePattern;
    }
    public void setPostcodePattern(String postcodePattern) {
        this.postcodePattern = postcodePattern;
    }

    public String getKoaza() {
        return koaza;
    }
    public void setKoaza(String koaza) {
        this.koaza = koaza;
    }

    public String getTyoume() {
        return tyoume;
    }
    public void setTyoume(String tyoume) {
        this.tyoume = tyoume;
    }

    public String getComplexPostcode() {
        return complexPostcode;
    }
    public void setComplexPostcode(String complexPostcode) {
        this.complexPostcode = complexPostcode;
    }

    public String getUpdate() {
        return update;
    }
    public void setUpdate(String n) {
        this.update = n;
    }

    public String getChange() {
        return change;
    }
    public void setChange(String change) {
        this.change = change;
    }




}
