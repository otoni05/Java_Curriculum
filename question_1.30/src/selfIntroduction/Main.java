package selfIntroduction;

class Main {
	static int personCnt = 0;
	
	public static void main(String[] args) {

		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		double bmi = person1.bmi();

		person1.print(bmi);
	}
}