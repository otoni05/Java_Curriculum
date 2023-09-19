package curriculum_B;

public class Qes_5 {
	/********************************************
	 *[概要]三桁表示の九*二十
	 *[詳細]九*二十の表を表示
	 ********************************************/

	public static void main(String[] args) {

		// 行のループ
		for(int num1 = 1; num1 <= 9; num1++) {

			// 列のループ
			for(int num2 = 1; num2 <= 20; num2++) {

				// 三桁表示にして表示
				System.out.printf("%03d * %03d = %03d" ,num1 ,num2 ,(num1 * num2));

				// 列が20の時の判定
				//"||"or "\n"を出力
				System.out.print(num2 != 20 ? "||" : "\n");

			}
		}
	}
}