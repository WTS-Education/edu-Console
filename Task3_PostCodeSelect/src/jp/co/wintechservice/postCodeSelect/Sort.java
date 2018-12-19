package jp.co.wintechservice.postCodeSelect;

import java.util.Comparator;
import java.util.List;

/**
 * 郵便番号（7桁） 昇順
 * @author kohari.junichirou
 *
 */
public class Sort {
    /**
     * 郵便番号の昇順をソート基準に設定したComparatorをsortの引数にしてソート
     * @param listOfOosaka
     * @return listOfOsaka
     */
    public List<Oosaka> sort(List<Oosaka> listOfOosaka) {
        listOfOosaka.sort(Comparator.comparing(Oosaka::getPostcode));
        return listOfOosaka;

    }

}
