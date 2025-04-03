package person;

import vehicle.Bicycle;
import vehicle.Car;

public class Person {
	
	public static int count = 0;
	public String firstName;

	
	public String lastName; 
	public int age;
	public double height, weight;

	/**
	 * 値をセットするコンストラクタ
	 * @param firstName
	 * @param age
	 * @param height
	 * @param weight
	 */
	Person(String firstName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * コンストラクタのオーバーロード
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param height
	 * @param weight
	 */
	public Person(String firstName, String lastName, int age, double height, double weight) {

		// 別のコンストラクタを呼び出すことで冗長なコードを避ける
		this(firstName, age, height, weight); 
		
		Person.count++;
		this.lastName = lastName;
	}

	/**
	 * 名前をフルネームにして返すメソッド
	 * @return フルネーム
	 */
	public String fullName() {
		return this.firstName + this.lastName;
	}
	
	/**
	 * 出力メソッド
	 */
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	/**
	 * BMIの値を返すメソッド
	 * @return BMIの値
	 */
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	/**
	 * 合計人数を出力するメソッド
	 */
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	/**
	 * 問題6：Personクラスにインスタンスメソッド「buy」を定義
	 * carを購入してオーナー名を出力
	 * @param car 仮引数
	 */
	public void buy(Car car) {
		
		// 問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセット
		car.setOwner(this.fullName());
		
		// 問題8：さらに、「〇〇が購入しました」と出力する処理を追加
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	/**
	 * 問題9：引数の型が異なるbuyメソッドを定義
	 * bicycleを購入してオーナー名を出力
	 * @param bicycle 仮引数
	 */
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}