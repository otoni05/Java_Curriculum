package animal;

public class AnimalName extends Animals {
	
	/**
	 * デフォルトコンストラクタ
	 */
	public AnimalName() {
        super("", 0.0, 0);
    }
	
	/**
	 * AnimalName クラスのコンストラクタ
	 * @param name   動物の名前
	 * @param length 体長
	 * @param speed  速度
	 */
	public AnimalName(String name, double length, int speed) {
		super(name, length, speed);
	}
	
	/**
	 * 名前を受け取って動物の学名を取得
	 * @return 動物の学名
	 */
	@Override
	protected String getScientificName() {
		switch (name) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウマ";
		case "インコ":
			return "不明";
		default:
			return "不明";
		}
	}
}