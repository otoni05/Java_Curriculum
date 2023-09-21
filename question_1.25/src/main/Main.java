package main;

import java.util.Scanner;

import character.SubClass;
import character.SuperClass;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("名前を入力してください: ");
		String name = scanner.nextLine();

		SuperClass subClass = new SubClass();
		subClass.setName(name);
		
		// getterから取得して出力
		System.out.println("こんにちは 「" + subClass.getName() + "」 さん");
		subClass.printStatus();
		// キャラクターのステータスを表示する
		scanner.close();
	}
}
