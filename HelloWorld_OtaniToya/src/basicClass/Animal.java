package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		Dog dog = new Dog();
		 // 変数animalを宣言し、初期値をnullに設定
		
		String animal = null;
		// DogクラスのanimalAssignメソッドを呼び出し、結果を変数animalに代入
		
		animal = dog.animalAssign();
		System.out.println(animal + "\n");
		
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		// DogクラスのnumAssignメソッドを呼び出し、結果を変数numに代入
		int num = dog.numAssign(5);
		System.out.println(num + "\n");
		
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// SimpleDateFormatのインスタンスを生成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		
		// 現在の日時を指定したフォーマットで文字列に変換
        String nowDate = sdf.format(new Date());
        System.out.println(nowDate);
	}

}
