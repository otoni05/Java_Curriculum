package process;

public class Processing {
	// フィールド変数
	
	// 動物の名前
	private String name;
	// 体長（単位: メートル）
	private double length;
	// 速度（単位: キロメートル/時）
	private int speed;
	
	// getter
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// setter
	public String setName() {
		return this.name;
	}
	public double setLength() {
		return this.length;
	}
	public int setSpeed() {
		return this.speed;
	}
	
	/**
	 *  出力用メソッド
	 */
	public void outPut() {
		System.out.println("動物名：" + this.name);
		System.out.println("体長：" + this.length + "m");
		System.out.println("速度：" + this.speed + "km/h");
	}
}