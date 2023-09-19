package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	/**
	 * Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	 * 
	 * @param num
	 * @param str
	 */
	public static void printHello(int num, String str) {
		System.out.println(str + " " + num + "\n");
	}

	/**
	 * Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void multiplication(int num1, int num2) {
		//        int result = num1 * num2;
		System.out.println(num1 * num2 + "\n");
	}

	/**
	 * Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	 * 
	 * @param arr
	 */ 
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
	}

	/**
	 * Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	 * @overlord
	 * @param num1
	 * @param num2
	 */
	public static void multiplication(double num1 , double num2) {
		System.out.println((num1 + num2) + "\n");
	}

	/**
	 * Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	 * 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	 * ※0は出力＆格納しないようにしてください。
	 * 
	 * @param num
	 * @return arr
	 */
	public static int[] randomNum(int num) {
		// 乱数を生成するためのRandomオブジェクトを作成
		Random random = new Random();
		
		// ランダムな数字を格納する配列を宣言
		int[] arr = new int[num];
		
		// num回ループしてランダムな数字を生成し、配列に格納
		for(int i = 0;i < num ;i++) {
			arr[i] = random.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		return arr;
	}

	/**
	 * Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	 * ※小数点以下も表示されるようにしてください。
	 * 
	 * @param randNums
	 * @return ave
	 */
	public static double aveArray(int[] randNums) {
		// 合計用とカウント用変数宣言・初期化
		int sum = 0 ,count = 0;
		
		// 平均値用変数宣言・初期化
		double ave = 0.0;
		
		// num回ループして、sumに値を入れる
		for(int num : randNums) {
			sum += num; 
			count++;
		}
		ave = sum / count;
		System.out.println("平均値：" + String.format("%.1f",ave) + "\n");
		return ave;
	}

	/**
	 * Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	 * 
	 * @param num
	 * @return (num >= 50)
	 * 
	 */
	public static boolean isAbove50(double num) {
		// 50以上ならばtrueそれ以外はfalseを返り値として返す
		return (num >= 50);
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// A1
		printHello(11, "Hello JavaSE");

		// A2
		multiplication(3, 4);

		// A3
		int[] number = {1, 2, 3, 4, 5};
		printArray(number);

		// A4 
		multiplication(2.5, 2.5);

		// A5
		int[] randNums = randomNum(5);

		// A6
		double ave = aveArray(randNums);

		// A7
		boolean above50 = isAbove50(ave);
		System.out.println(above50);
	}

}
