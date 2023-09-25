package main;

import animal.AnimalName;
import animal.Animals;

public class Main {

	public static void main(String[] args) {

		String input = null;

		Animals animals = new AnimalName();
		
		input = animals.inputData();
		
		// 入力をコンマで分割して配列に格納
		String[] animalsData = input.split(",");

		// 配列分ループ
		for (String animalInfo : animalsData) {
			
			// コロン区切りで配列
			String[] info = animalInfo.split(":");
			
			// 各項目の変数に代入
			String name = info[0];
			double length = Double.parseDouble(info[1]);
			int speed = Integer.parseInt(info[2]);
			
			AnimalName animalName = new AnimalName(name, length, speed);
			
			// 出力
			animalName.printData();
		}
	}
}