package curriculum_B;

import java.util.Scanner;

public class Qes_7 {
	/***************************
	 * [概要]N人の生徒の成績を管理するプログラムを下記条件で作成
	 * [詳細]生徒数を入力して、各生徒、各教科別の点数を入力後、
	 * 			自動で個人平均点、教科別平均点、全体平均点が出力される
	 * （※たぶんループ時の変数統一できる：省略可能箇所アリ）
	 **************************/
	
	public static void main(String[] args) {
		
		// scanner宣言
		Scanner scanner = new Scanner(System.in);
		//教科
		String[] subjects = {"英語","数学","理科","社会"};
		// Loop用変数
		int i = 0,j = 0;
		// 学生数用変数
		int students = 0;
		//判定用変数
		boolean isLoop = false;
		
		while(!isLoop) {
			System.out.print("生徒の人数を入力してください（2以上）：");
			students = scanner.nextInt();
			
			// 2以上なら
			if(students >= 2) {
				isLoop = true;
				System.out.println();
			}else {
				continue;
			}
		}
		
		/*****************************
		 * 点数入力
		 *****************************/
		// 点数用配列
		int[][] points = new int[students][subjects.length];
		
		// 点数入力
		for(i = 0; i < students; i++) {
			for(j = 0; j < subjects.length; j++) {
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください：");
				points[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		
		/*****************************
		 * 個人平均点出力
		 *****************************/
		// 学生別合計変数
		int[] stuSum = new int[students];
		
		for(i = 0; i < students; i++) {
			for(j = 0; j < subjects.length; j++) {
				stuSum[i] += points[i][j];
			}
			// 平均
			double ave = (double)stuSum[i] / subjects.length;
			System.out.printf("%d人目の平均点は %.2f点です。\n" ,j+1, ave);
		}
		System.out.println();
		
		/*****************************
		 * 教科別平均点出力
		 *****************************/
		// 教科別合計変数
		int[] subSum = new int[subjects.length];
	
		for(i = 0;i < subjects.length; i++) {
			for(j = 0; j < students; j++) {
				subSum[i] += points[j][i];
			}
			// 平均
			double ave = (double)subSum[i] / students;
			System.out.printf("%sの平均点は%.2f点です。\n" ,subjects[i], ave);
		}
		
		/*****************************
		 * 全体平均点出力
		 *****************************/
		// 全点数合計変数
		int sum = 0;
	
		for(i = 0;i < students; i++) {
			for(j = 0; j < subjects.length; j++) {
				sum += points[i][j];
			}
		}
		// 平均
		double ave = (double)sum / (students * subjects.length);
		System.out.printf("全体の平均点は%.2f点です。\n" , ave);
		
		scanner.close();
	}
}