package main;

public class Person{
	public static int count = 0;
	
	public String firstName;
	public String lastName; //問題:1 lastName追加
	public int age;
	public double height, weight;

	Person(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName; //問題:2 lastNameの引数を受け取るコンストラクタ
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// インスタンスが生成されるたびにcountを増加
		Person.count++;
	}

	public String fullName(){
		return this.firstName + this.lastName;
	}

	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}