package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Processing {
	
	// 各名詞の変数
	private String greeting;
	private String countrys;
	private String food;		
	private String kindsFood;
	
	// 現在の日時を格納する変数
	private String dateTime;

	// コンストラクタ
	public Processing() {
		// 現在の日時を取得し、dateTime変数に格納
		this.dateTime = getDateTime();
		this.greeting = "こんにちは";
		this.countrys = "日本";
		this.food = "寿司";
		this.kindsFood = "和食";
	}
	
	/**
	 * 現在の日時を取得するメソッド
	 * @return nowDate
	 */
	private String getDateTime() {
		// SimpleDateFormatのインスタンスを生成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd H:m:s");

		// 現在の日時を指定したフォーマットで文字列に変換
		String nowDate = sdf.format(new Date());
		return nowDate;
	}
	
	/**
	 * メッセージを出力するメソッド
	 */ 
	public void outPutMsg() {
		// メッセージの変数を出力
		System.out.println(this.greeting + "!ここは" + this.countrys + "です!");
		System.out.println("この" + food + "はうまい");
		System.out.println(this.food + "は" + this.kindsFood + "です");
		// 現在の日時を出力
		System.out.println("今の現在日時は" + this.dateTime + "です");
	}
}