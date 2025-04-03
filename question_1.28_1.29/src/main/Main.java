package main;

import java.util.Scanner;

import process.Data;
import process.Display;
import process.Sorting;

public class Main {
	static String num = null;
	static String input = null;
	static String[] numArray;

	/**
	 * 数字以外使われていなかチェック
	 * @param numArray2
	 * @return
	 */
	public static boolean isNumeric(String[] numArray2) {
		for (String num : numArray2) {
			if (!num.matches("-?\\d+")) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 都道府県データを処理し、表示するメインクラス
	 */
	public static void main(String[] args) {

		boolean isCheck = false;
		Scanner scanner = new Scanner(System.in);

		System.out.print("昇順で並べる場合は0を、降順で並べる場合は1を入力してください：");
		
		// 正しい値になるまでループ
		while (true) {
			num = scanner.nextLine();
			// 0 or 1以外のチェック
			if (num.equals("0") || num.equals("1")) {
				break;
			} else {
				System.out.print("\n無効な入力です。\n再度入力してください：");
			}
		}
		// 整数値に変換
		int order = Integer.parseInt(num);

		System.out.print("都道府県の番号を選択して入力してください：");

		// 正しい値になるまでループ
		while (true) {
			do {
				input = scanner.nextLine();
				isCheck = (input != null && !input.trim().isEmpty());

				// nullチェック
				if (!isCheck) {
					System.out.print("\n無効な入力です。\n再度入力してください：");
				} else {
					
					// カンマ区切りにして配列に代入
					numArray = input.split(",");
					
					// 記号ローマ字チェック
					if (!isNumeric(numArray)) {
						System.out.print("\n無効な入力です。\n再度入力してください：");
					}
				}
			// どのチェックにも引っかからなければ抜ける
			} while (!isCheck || !isNumeric(numArray));

			String[] prefectures = new String[numArray.length];

			for (int i = 0; i < numArray.length; i++) {
				// 整数に変換
				int index = Integer.parseInt(numArray[i]);

				// 都道府県データの数より多いかチェック
				if (index >= 0 && index < Data.prefectures.length) {
					prefectures[i] = Data.prefectures[index];
				} else {
					System.out.print("\n無効な入力です。\n再度入力してください：");
					break;
				}
			}
			
			// 入力したすべての番号に対して正常に都道府県データが取得できた場合
			if (prefectures[prefectures.length - 1] != null) {
				System.out.println();
				break;
			}
		}

		String[] sortedPrefectures = Sorting.sortPrefectures(numArray, order);

		Display.displayPrefectures(sortedPrefectures);

		scanner.close();
	}
}