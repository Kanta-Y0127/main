package main;

public class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// 問題1: クラスフィールドの定義
	public static int count = 0;

	public	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// 問題2: countを1増やす
		count++;
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
		
	// 問題4: クラスメソッドの定義
	public static void printCount() {

		// 問題5: クラスフィールドcountを用いて合計人数を表示
		System.out.println("合計" + count + "人です");
	}
}