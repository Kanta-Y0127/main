package main;

public class Person {
    // 問題1: インスタンスフィールドの定義
    public String name;   // 名前
    public int age;       // 年齢
    public double height; // 身長
    public double weight; // 体重（問題4で追加）

    // 人数をカウントするためのフィールド
    public static int personCount = 0;

    // 問題2, 3, 4: コンストラクタの定義
    public Person(String name, int age, double height, double weight) {
        this.name = name;        // thisでフィールドに値をセット
        this.age = age;
        this.height = height;
        this.weight = weight;

        // インスタンスが生成されるたびに人数を増やす
        personCount++;
    }

    // 問題6, 7: BMIを計算して返すメソッド
    public double bmi() {
        return Math.floor(this.weight / this.height / this.height);
    }

    // 問題8, 9: 自己紹介を表示するメソッド
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        System.out.printf("BMIは%.1fです\n", this.bmi());  // 小数点1桁まで表示
		System.out.println();

    }

    // 問題10: 合計人数を表示するメソッド（静的メソッド）
    public static void printPersonCount() {
        System.out.println("合計" + personCount + "人です");
    }
}
