package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();

		// メッセージの出力
		System.out.println(dog.animal + "\n");
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dogNum = new Dog(5);
		
		// メッセージの出力
		System.out.println(dogNum.animalNum + "\n");
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		
		// 現在の日時を指定したフォーマットで文字列に変換
        String nowDate = sdf.format(new Date());
        System.out.println(nowDate);
	}
}
