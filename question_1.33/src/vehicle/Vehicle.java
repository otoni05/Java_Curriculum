package vehicle;

public class Vehicle {
	
	// 問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義
	private String owner;
	
	/**
	 * 問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義
	 * getter
	 * @return owner オーナー名
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * 問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義
	 * setter
	 * @param owner オーナー名
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

}