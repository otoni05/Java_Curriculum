package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String animal;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	int animalNum;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public String animalAssign() {
		animal = "犬";
		
		// 戻り値
		return animal;
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public int numAssign(int num) {
		// 引数で受け取った値を変数animalNumに代入
		animalNum = num;
		
		// 戻り値
		return animalNum;
	}
}
