package animal;

import java.util.Scanner;

public abstract class Animals {
	
	private String data;
	private boolean isNull;
	
	protected String name;
	private double length;
	private int speed;
	
	/**
	 * コンストラクタ
	 * @param name   動物の名前
	 * @param length 体長
	 * @param speed  速度
	 */
	public Animals(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}
	
	/**
	 * 抽象メソッド：サブクラスで実装必須
	 * @return
	 */
	protected abstract String getScientificName();

	/**
	 * 出力するメソッド
	 */
	public void printData() {
		String scientificName = getScientificName();

		System.out.println("動物名：" + name);
		System.out.println("体長：" + length + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + scientificName);
		System.out.println();
	}
	
	/**
	 * データ入力兼Nullチェック
	 * @return data 
	 */
	public String inputData() {
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("データをコンマ区切りで入力してください");
			data = scanner.nextLine();

			// 入力がnullでないかつ空白でない場合はisNameをtrueに設定
			isNull = (data != null && !data.trim().isEmpty()); 
		}while(!isNull);
		
		System.out.println();
		
		scanner.close();
		return data;
	}
}