package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	/********************************************
	 *[概要]ユーザー名認証システムと自動じゃんけん 
	 *[詳細]正しい名前が入力されたら勝つまでじゃんけん
	 ********************************************/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String userName = null;

		// ユーザー名が正しく入力されるまでループ
		while (true) {
			// 分かりやすいため追加
			System.out.print("「ユーザー名を入力してください」：");

			// ユーザー名の入力
			userName = scanner.nextLine();            

			if (userName == null || userName.length() == 0) {
				// 値が入っていない場合
				System.out.println("「名前を入力してください」" + "\n");
			} else if (userName.length() > 10) {
				// 11文字以上の場合
				System.out.println("「名前を10文字以内にしてください」" + "\n");
			} else if(!userName.matches("[a-zA-Z0-9]+")){
				// 半角英数以外がある場合
				System.out.println("「半角英数字のみで名前を入力してください」" + "\n");
			} else {
				// ユーザー名の登録メッセージを出力
				System.out.println("ユーザー名「" + userName + "」を登録しました" + "\n");

				// 正しいユーザー名が入力された場合、ループを抜ける
				break;
			}
		}

		// じゃんけんゲーム開始
		// 勝敗カウント：宣言と初期化
		int count = 0; 
		Random random = new Random();

		// じゃんけんの手：三種類
		String hands[] = {"グー","チョキ","パー"};
		while (true) {
			count++;

			// ユーザーの手をランダムに選択
			// 0: グー, 1: チョキ, 2: パー
			int userHand = random.nextInt(3); 

			// 相手の手もランダムに選択
			int enemyHand = random.nextInt(3);

			System.out.println(userName + "の手は「" + hands[userHand] + "」");
			System.out.println("相手の手は「" + hands[enemyHand] + "」");

			// 勝敗判定のメソッドを呼び出して代入
			int result = rps(userHand, enemyHand);

			if (result == 1) {
				// じゃんけんに勝った場合
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて" + "\n");

				break;
				
			// 負けた場合	
			} else if (result == -1) {
				// グーに負けた場合
				if(enemyHand == 0) {
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！" + "\n");

					// チョキに負けた場合
				} else if(enemyHand == 1) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ" + "\n");

					// パーに負けた場合
				} else if(enemyHand == 2) {
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです" + "\n");
				}

			} else {
				// あいこだった場合
				System.out.println("DRAW あいこ もう一回しましょう！" + "\n");
			}
		}
		// 勝つまでにかかった回数出力
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");

		// Scannerを閉じる
		scanner.close();
	}
	
	/** 勝敗判定メソッド
	 * 
	 * @param userHand
	 * @param enemyHand
	 * @return 引き分けの時は0、勝ちの時は1、負けの時は-1を返す
	 */
	
	// Rock,scissors, paperの略称としてrps
	public static int rps(int userHand, int enemyHand) {

		// 引き分け
		if (userHand == enemyHand) {
			return 0; 

			// ユーザーの勝ち
		} else if ((userHand == 0 && enemyHand == 1) || 
				(userHand == 1 && enemyHand == 2) ||
				(userHand == 2 && enemyHand == 0)) {
			return 1; 

			// ユーザーの負け	
		} else {
			return -1; 
		}
	}
}