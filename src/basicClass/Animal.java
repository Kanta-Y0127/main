package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog dog = new Dog("犬の名前は犬");  // 名前代入
        System.out.println(dog.getName());  // getNameメソッドで名前を取得して出力
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Dog anotherDog = new Dog("犬", 11);  // 名前と数を指定してDogクラスを呼び出す
        System.out.println("数:" + anotherDog.getCount());  // getCountメソッドで数を取得して出力

		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        String currentDate = formatter.format(new Date());
        System.out.println("現在の日時:" + currentDate);
		
	}
}
