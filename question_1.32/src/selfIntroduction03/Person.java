package selfIntroduction03;

class Person {
	public static int count = 0;
	public String firstName;

	// 問題1：インスタンスフィールドに「lastName」を追加
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
		
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * コンストラクタのオーバーロード
     * 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義
     * ※順番はfirstNameの次
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param height
	 * @param weight
	 */
	Person(String firstName, String lastName, int age, double height, double weight) {
		
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセット
		Person.count++;
		this.lastName = lastName;
	}

	/**
	 * 名前をフルネームにして返すメソッド
	 * @return
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
	 * @return
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
}