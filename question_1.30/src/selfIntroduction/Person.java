package selfIntroduction;

class Person{
	
	// インスタンスフィールドを定義
	static int personCnt = 0;
	String name;
	int age;
	double height;
	private double weight;

	/**
	 * コンストラクタを定義しインスタンスフィールドに値をセット
	 * @param name   名前
	 * @param age    年齢
	 * @param height 身長
	 * @param weight 体重
	 */
	
	/**
	 */
	Person(String name, int age, double height, double weight){
		personCnt++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * BMIの計算メソッド
	 * @return bmi BMIの値が入った変数
	 */
	public double bmi() {
		double bmi =  this.weight / (this.height * this.height);
		return bmi;
	}

	/**
	 * 出力するメソッド
	 * 小数点以下１表示
	 * @param bmi 
	 */
	public void print(double bmi) {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		System.out.println("合計" + personCnt + "人です");
	}
}