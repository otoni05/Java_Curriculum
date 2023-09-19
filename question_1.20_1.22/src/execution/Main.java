package execution;

import process.Processing;

public class Main {

	public static void main(String[] args) {
		
		Processing processing = new Processing("こんにちは", "日本", "寿司", "和食");
		
		// メッセージの出力
		processing.outPutMsg();
	}
}
