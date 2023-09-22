package character;

import java.util.Scanner;

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
	private boolean isName;
	/**
     * スーパークラスのコンストラクタ
     * @param hp   キャラクターの体力ポイント
     * @param mp   キャラクターの魔法ポイント
     * @param atk  キャラクターの攻撃力
     * @param agi  キャラクターの素早さ
     * @param def  キャラクターの防御力
     * @param isName 名前入力時の判定
     */
	public SuperClass(int hp, int mp, int atk, int agi, int def) {
		this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.agi = agi;
        this.def = def;
        this.isName = false;
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
	
	public void printStatus() {
        
        System.out.println("ステータス");
        System.out.println("HP：" + this.hp);
        System.out.println("MP：" + this.mp);
        System.out.println("攻撃力：" + this.atk);
        System.out.println("素早さ：" + this.agi);
        System.out.println("防御力：" + this.def);
        System.out.println("\nさあ冒険に出かけよう！");
    }

	public String inputName() {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("名前を入力してください: ");
			name = scanner.nextLine();
			
			// 入力がnullでないかつ空白でない場合はisNameをtrueに設定
			isName = (name != null && !name.trim().isEmpty()); 
		}while(!isName);
		
		scanner.close();
		
		return name;
	}	
}