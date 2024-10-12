package main;

class Main{
	public static void main(String[] argos){
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		
        // 問題3: 合計人数を出力
        System.out.println("合計" + Person.count + "人です");  // クラスフィールドに直接アクセス
        
        // 問題6: クラスメソッドprintCountの呼び出し
        Person.printCount();

	}
}