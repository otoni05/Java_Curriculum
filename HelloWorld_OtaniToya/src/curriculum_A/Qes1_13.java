package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		/********************************************
		問1.ローカル変数宣言

		 ********************************************/
		byte byteValue;
		short shortValue;
		int intValue;
		long longValue;
		float floatValue;
		double doubleValue;
		char charValue;
		String StringValue;
		boolean isValid;

		/********************************************
		問2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください

		 ********************************************/
		/*-------------------------------------------
		 [概要]初期値代入
		 -------------------------------------------*/
		byteValue = 0;
		shortValue = 0;
		intValue = 0;
		longValue = 0;
		floatValue = 0;
		doubleValue = 0.0;
		charValue = 0;
		StringValue = null;
		isValid = false;

		/********************************************
		問3.初期化をしたそれぞれの変数に下記の値を代入してください
		 ********************************************/
		/*-------------------------------------------
		 [概要]値代入
		 -------------------------------------------*/
		byteValue = 10;
		shortValue = 100;
		intValue = 1000;
		longValue = 10000L;
		floatValue = 9.5F;
		doubleValue = 10.5D;
		charValue = 'a';
		StringValue = "ハロー";
		isValid = true;

		/********************************************
		問4.下記の通りにコンソール出力されるようにしてください
		 ********************************************/
		/*-------------------------------------------
		 [概要]出力処理
		 -------------------------------------------*/
		System.out.println(byteValue + shortValue + intValue + longValue);
		System.out.println(String.format("%.0f",floatValue + doubleValue));
		System.out.println(charValue + " " + StringValue + " " + isValid);
		System.out.println(String.format("%.0f",byteValue + shortValue + intValue + longValue + floatValue + doubleValue));
		System.out.println(byteValue * shortValue * intValue * longValue);
		System.out.println(doubleValue / shortValue);
		System.out.println(byteValue - shortValue +"\n");

		/********************************************
		問5.次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		  「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 ********************************************/
		/*-------------------------------------------
		 [概要]宣言と代入
		 -------------------------------------------*/
		int num0= 20;
		int num1= 23;
		
		//出力処理
		System.out.println("ハローJAVA"+(num0 + num1) + "\n");

		/********************************************
		問6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください		
           ローカル変数に代入し○○に入れてください		
          『山田太郎 18歳 170.5cm 62.2kg 寿司』		
		 ********************************************/
		/*-------------------------------------------
		 [概要]宣言と代入
		 -------------------------------------------*/
		String name = "山田太郎";
		int age = 18;
		double height = 170.5D;
		double weight = 62.2D;
		String hobby = "寿司";
		
		//出力処理
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + hobby + "です");

		/********************************************
		問7.6で作成した自己紹介に続いてBMIが出力されるようにしてください			
          「BMIは○○です」			
           ただし計算は数値を直書きせず、全て変数を使ってすること			

		 ********************************************/
		/*-------------------------------------------
		 [概要]出力処理
		 -------------------------------------------*/
		//String.formatを利用して出力する桁数を指定
		System.out.println("BMIは" + String.format("%.1f", (weight / (height * height)* 10000))  + "です" + "\n");

		/********************************************
		問8.6で宣言した変数に再代入し下記の通りコンソールに出力してください
		 ********************************************/
		/*-------------------------------------------
		 [概要]宣言と代入
		 -------------------------------------------*/
		
		name = "鈴木一郎";
		age = 24;
		height = 168.5D;
		weight = 64.2D;
		hobby = "オムライス";

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + hobby + "です");
		//String.formatを利用して出力する桁数を指定
		System.out.println("BMIは" + String.format("%.1f", (weight / (height * height) * 10000))  + "です" +"\n");
		
		/********************************************
		問9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		 ********************************************/
		/*-------------------------------------------
		 [概要]宣言と代入
		 -------------------------------------------*/
		name = "鈴木一郎";
		age = age +24;
		height = height + 168.5D;
		weight = weight + 64.2D;
		hobby = "オムライス";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + hobby + "です");
		//String.formatを利用して出力する桁数を指定
		System.out.println("BMIは" + String.format("%.2f", (weight / (height * height) * 10000))  + "です" +"\n");
		
		/********************************************
		問10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		 ********************************************/
		/*-------------------------------------------
		 [概要] Boolean型を宣言し、判定
		 -------------------------------------------*/
		age = 24;
		
		boolean isAge = age >= 25;
		System.out.println(isAge + "\n");
		
		/********************************************
		問11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		 ********************************************/
		/*-------------------------------------------
		 [概要] 代入と型変換
		 -------------------------------------------*/
		height = 168.5D;
		weight = 64.2D;
		
		String conAge = String.valueOf(age);
		String conHeight = String.valueOf(height);
		String conWeight = String.valueOf(weight);
		
		//出力処理
		System.out.println(conAge + conHeight + conWeight + "\n");
		
		/********************************************
		問12.11で変換した【年齢・身長】を整数型に変換して出力してください
		 ********************************************/
		/*-------------------------------------------
		 [概要]整数型へ型変換
		 -------------------------------------------*/
		int newAge = Integer.parseInt(conAge.replaceAll("[^0-9]", ""));
		int newHeight = Integer.parseInt(conHeight.replaceAll("[^0-9]", ""));
		//出力処理
		System.out.println(newAge);
		System.out.println(newHeight);
		System.out.println();
		
		/********************************************
		問13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
           ただしif文は使わないでください
		 ********************************************/
		/*-------------------------------------------
		 [概要]Boolean型を宣言し、判定
		 -------------------------------------------*/
		boolean isAbout = age >= 25 || newHeight >= 160;
		//出力処理
		System.out.println(isAbout + "\n");

	}

}
