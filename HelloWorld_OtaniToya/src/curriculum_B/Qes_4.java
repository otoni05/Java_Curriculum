package curriculum_B;

public class Qes_4 {
	/********************************************
	 *[概要]二桁表示の九九
	 *[詳細]九九の表を表示
	 ********************************************/
	
	public static void main(String[] args) {
		
		// 行のループ
		for(int num1 = 1; num1 <= 9; num1++) {
			
			// 列のループ
			for(int num2 = 1; num2 <= 9; num2++) {
				
				// 二桁表示にして表示
				System.out.printf("%02d * %02d = %02d" ,num1 ,num2 ,(num1 * num2));
				
				// 列が9の時の判定
				//"||"or "\n"を出力
				System.out.print(num2 != 9 ? "||" : "\n");
			}
		}
	}
}