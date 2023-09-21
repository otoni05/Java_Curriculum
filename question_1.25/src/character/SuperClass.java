package character;

/**
 * スーパークラスの基本的なキャラクター情報を管理するクラス
 */
public class SuperClass {
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int agi;
	private int def;
	
	/**
     * スーパークラスのコンストラクタ
     * @param hp   キャラクターの体力ポイント
     * @param mp   キャラクターの魔法ポイント
     * @param atk  キャラクターの攻撃力
     * @param agi  キャラクターの素早さ
     * @param def  キャラクターの防御力
     */
	public SuperClass(int hp, int mp, int atk, int agi, int def) {
		this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.agi = agi;
        this.def = def;
	}
	
	/**
     * キャラクターの名前を設定
     * @param name キャラクターの名前
     */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
     * キャラクターの名前を取得
     * @return キャラクターの名前
     */
	public String getName() {
		return this.name;
	}
	
	/**
     * キャラクターのステータスをコンソールに出力
     */
	public void printStatus() {
        
        System.out.println("ステータス");
        System.out.println("HP：" + this.hp);
        System.out.println("MP：" + this.mp);
        System.out.println("攻撃力：" + this.atk);
        System.out.println("素早さ：" + this.agi);
        System.out.println("防御力：" + this.def);
        System.out.println("\nさあ冒険に出かけよう！");
    }
}
