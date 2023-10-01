package main;

import person.Person;
import vehicle.Bicycle;
import vehicle.Car;

public class Main {

	/**
	 * 問題4：MainクラスにsetOwnerを用いて、
	 * Carクラスのインスタンス「car」の所有者を「person1」に、
	 * Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定
	 * Personクラスのインスタンスからフルネームを取得し、ownerにセット
	 * @param args
	 */
	public static void main(String[] args) {

		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		//person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		//person2.print();

		//Person.printCount();

		Car car = new Car();

		Bicycle bicycle = new Bicycle();

		/* 問題5：セットできたら、ownerをコンソールに出力
		//ownerを設定
		//car.setOwner(person1.fullName());
		//bicycle.setOwner(person2.fullName());

		//System.out.println(car.getOwner());   
		//sSystem.out.println(bicycle.getOwner());
		 */
		
		/* 問題10：Mainクラスからbuyメソッドを用いて、
		「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成
		 */
		person1.buy(car);
		person2.buy(bicycle);
	}
}