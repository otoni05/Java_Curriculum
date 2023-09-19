package curriculum_B;

import java.util.Scanner;

public class Qes_7 {
	/***************************
	 * [概要]N人の生徒の成績を管理するプログラムを下記条件で作成
	 * [詳細]生徒数を入力して、各生徒、各教科別の点数を入力後、
	 * 			自動で個人平均点、教科別平均点、全体平均点が出力される
	 **************************/

	public static void main(String[] args) {

		// scanner宣言
		Scanner scanner = new Scanner(System.in);
		// 教科
		String[] subjects = {"英語","数学","理科","社会"};
		// Loop用変数
		int i = 0,j = 0;
		// 学生数用変数
		int students = 0;
		// 判定用変数
		boolean isLoop = false;

		// 正しい生徒数になるまでループ
		while(!isLoop) {
			System.out.print("生徒の人数を入力してください（2以上）：");
			students = scanner.nextInt();

			// 2以上なら
			isLoop =students >= 2 ? true: false;
		}
		System.out.println();

		/*****************************
		 * 点数入力
		 *****************************/
		// 点数用配列
		int[][] points = new int[students][subjects.length];

		// 点数入力のため生徒数分回す
		for(i = 0; i < students; i++) {

			// 点数入力のため教科数分回す
			for(j = 0; j < subjects.length; j++) {
				System.out.printf("%d人目の『%s』の点数を入力してください：" ,(i + 1) ,subjects[j]);

				// ここで数値以外の入力に対するエラーチェックを行う
				if (scanner.hasNextInt()) {
					points[i][j] = scanner.nextInt();
				} else {
					System.out.println("無効な入力です。数値を入力してください。");
					// 不正な入力を読み捨てる
					scanner.next(); 
					// 同じ要素を再度入力させるために j を減らす
					j--; 
				}
			}
			System.out.println();
		}

		/*****************************
		 * 個人平均点出力
		 *****************************/
		// 学生別合計変数
		int[] stuSum = new int[students];

		// 合計の配列に適当な点数を生徒数分回す
		for(i = 0; i < students; i++) {

			// 合計の配列に適当な点数を教科数分回す
			for(j = 0; j < subjects.length; j++) {
				stuSum[i] += points[i][j];
			}
			// 平均
			double ave = (double)stuSum[i] / subjects.length;
			System.out.printf("%d人目の平均点は %.2f点です。\n" ,i+1 ,ave);
		}
		System.out.println();

		/*****************************
		 * 教科別平均点出力
		 *****************************/
		// 教科別合計変数
		int[] subSum = new int[subjects.length];

		// 合計の配列に適当な点数を教科数分回す
		for(i = 0;i < subjects.length; i++) {

			// 合計の配列に適当な点数を生徒数分回す
			for(j = 0; j < students; j++) {
				subSum[i] += points[j][i];
			}
			// 平均
			double ave = (double)subSum[i] / students;
			System.out.printf("%sの平均点は%.2f点です。\n" ,subjects[i] ,ave);
		}

		/*****************************
		 * 全体平均点出力
		 *****************************/
		// 全点数合計変数
		int sum = 0;

		// 教科別合計配列の値を合計用配列に代入するため教科数分回す
		for(i = 0; i < subjects.length; i++) {
			sum += subSum[i];
		}

		// 平均
		double ave = (double)sum / (students * subjects.length);
		System.out.printf("全体の平均点は%.2f点です。\n" ,ave);

		// scannerを閉じる
		scanner.close();
	}
}