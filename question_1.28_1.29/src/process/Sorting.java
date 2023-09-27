package process;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

	/**
	 * 選択された都道府県番号に基づき、都道府県データを指定された順序でソート
	 * 
	 * @param numArray           選択された都道府県番号の配列
	 * @param order              ソートの順序（0：昇順、1：降順）
	 * @return sortedPrefectures ソートされた都道府県データの配列
	 */
	public static String[] sortPrefectures(String[] numArray, int order) {

		String[] sortedPrefectures = new String[numArray.length];

		// 対応する都道府県を代入
		for (int i = 0; i < numArray.length; i++) {
			int index = Integer.parseInt(numArray[i]);
			sortedPrefectures[i] = Data.prefectures[index];
		}
		
		// ソート順序
		if (order == 0) {
			sortedPrefectures = sortAreaAsc(sortedPrefectures);
		} else if (order == 1) {
			sortedPrefectures = sortAreaDesc(sortedPrefectures);
		} else {
			System.out.println("不正な入力です。");
		}
		
		return sortedPrefectures;
	}

	/**
	 * 都道府県データを面積で昇順にソート
	 *
	 * @param prefectures   ソート対象の配列
	 * @return prefectures  面積で昇順にソートされた配列
	 */
	private static String[] sortAreaAsc(String[] prefectures) {
		// 面積を取得して、都道府県情報を面積で昇順にソート
		Arrays.sort(prefectures, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				// 1番目の要素が面積
				int area1 = Integer.parseInt(o1.split(":")[2]);
				// 1番目の要素が面積
				int area2 = Integer.parseInt(o2.split(":")[2]);
				
				// Integer.compareメソッドを使用して、2つの整数を比較した結果を返す
				return Integer.compare(area2, area1);
			}
		});
		return prefectures;
	}
	
	/**
	 * 都道府県データを面積で降順にソート
	 * 
	 * @param prefectures  ソート対象の配列
	 * @return prefectures 面積で降順にソートされた配列
	 */
	private static String[] sortAreaDesc(String[] prefectures) {
		// 面積を取得して、都道府県情報を面積で昇順にソート
		Arrays.sort(prefectures, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				// 1番目の要素が面積
				int area1 = Integer.parseInt(o1.split(":")[2]);
				// 1番目の要素が面積
				int area2 = Integer.parseInt(o2.split(":")[2]);
				
				// Integer.compareメソッドを使用して、2つの整数を比較した結果を返す
				return Integer.compare(area1, area2);
			}
		});
		return prefectures;
	}
}