package main;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);// 

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println();


		// インスタンスメソッドを使って自己紹介を表示
		person1.print();

		// 合計人数を表示
		Person.printPersonCount();
	}
}