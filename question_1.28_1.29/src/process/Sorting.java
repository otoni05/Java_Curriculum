package process;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

    public static String[] sortPrefectures(String[] numArray, int order) {
        String[] sortedPrefectures = new String[numArray.length];

        for (int i = 0; i < numArray.length; i++) {
            int index = Integer.parseInt(numArray[i]);
            sortedPrefectures[i] = Data.prefectures[index];
        }

        if (order == 0) {
            sortedPrefectures = sortAreaAsc(sortedPrefectures);
        } else if (order == 1) {
            sortedPrefectures = sortAreaDesc(sortedPrefectures);
        } else {
            System.out.println("不正な入力です。");
        }
        return sortedPrefectures;
    }

    
    private static String[] sortAreaDesc(String[] prefectures) {
        // 面積を取得して、都道府県情報を面積で昇順にソート
        Arrays.sort(prefectures, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int area1 = Integer.parseInt(o1.split(":")[2]);
                int area2 = Integer.parseInt(o2.split(":")[2]);
                return Integer.compare(area1, area2);
            }
        });
        return prefectures;
    }


    private static String[] sortAreaAsc(String[] prefectures) {
        // 面積を取得して、都道府県情報を面積で昇順にソート
        Arrays.sort(prefectures, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int area1 = Integer.parseInt(o1.split(":")[2]);
                int area2 = Integer.parseInt(o2.split(":")[2]);
                return Integer.compare(area2, area1);
            }
        });
        return prefectures;
    }

}
