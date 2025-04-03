package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Processing {
	
	// 各名詞の変数
	private String greeting;
	private String countrys;
	private String foods;		
	private String kindsFood;
	
	// 現在の日時を格納する変数
	private String dateTime;

	/**
	 * 引数をフィールド変数に代入する
	 * @param hello 挨拶
	 * @param country 国名
	 * @param food 食べ物
	 * @param kind 食事の種類
	 */
	public Processing(String hello, String country, String food, String kind) {
		// 現在の日時を取得し、dateTime変数に格納
		this.dateTime = getDateTime();
		this.greeting = hello;
		this.countrys = country;
		this.foods = food;
		this.kindsFood = kind;
	}
	
	/**
	 * 現在の日時を取得するメソッド
	 * @return nowDate
	 */
	private String getDateTime() {
		
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
		System.out.println("この" + foods + "はうまい");
		System.out.println(this.foods + "は" + this.kindsFood + "です");
		// 現在の日時を出力
		System.out.println("今の現在日時は" + this.dateTime + "です");
	}
}