package main;

import process.Processing;

public class Main {

	public static void main(String[] args) {
		Processing processing = new Processing();
		
		// 値をセッターメソッドを使ってセットする
		processing.setName("ライオン");
		processing.setLength(2.1);
		processing.setSpeed(80);
		
		// 出力メソッドを呼び出す
		processing.outPut();
	}

}
