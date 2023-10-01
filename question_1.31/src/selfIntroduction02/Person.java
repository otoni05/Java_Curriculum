package selfIntroduction02;

class Person{
	// 問題1：クラスフィールド「count」を定義
	public static int count = 0; 

	public String name;
	public int age;
	public double height;
	public double weight;

	/**
	 * コンストラクタ
	 * @param name   名前
	 * @param age    年齢
	 * @param height 身長
	 * @param weight 体重
	 */
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 問題2：Personコンストラクタの中でクラスフィールドcountに1を足す
		count++; 
	}

	/**
	 * BMIを返すメソッド
	 * @return
	 */
	public double bmi(){
		return this.weight / this.height / this.height;
	}

	/**
	 * 年齢と歳を出力するメソッド
	 */
	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	/**
	 * 問題4：クラスメソッド「printCount」を定義
	 * 問題5：クラスメソッドの中でクラスフィールド「count」を用いて「合計〇〇人です」と出力
	 */
	public static void printCount(){ 
		System.out.println("合計" + count + "人です");  
	}
}