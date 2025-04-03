package main;

import character.SubClass;
import character.SuperClass;

public class Main {

	public static void main(String[] args) {
		
		// 受け取り用変数
		String name = null;
		
		SuperClass subClass = new SubClass();
		
		name = subClass.inputName();
		
		System.out.println();
		
		subClass.setName(name);
		
		// getterから取得して出力
		System.out.println("こんにちは 「" + subClass.getName() + "」 さん");
		subClass.printStatus();
		// キャラクターのステータスを表示する
		
	}
}
