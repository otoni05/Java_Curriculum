package character;

import java.util.Random;

public class SubClass extends SuperClass {

	static Random random = new Random(); 
	
	/**
     * SubClassのコンストラクタ。
     * ランダムな値でSuperClassを初期化
     */
	public SubClass() {
		super(random.nextInt(1000)+1
				,random.nextInt(1000)
				,random.nextInt(1000)
				,random.nextInt(1000)
				,random.nextInt(1000));
	}
}
