package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        byte byteVar;		// バイト型の定義
        short shortVar; 	// 短整数型の定義
        int intVar; 		// 整数型の定義
        long longVar; 		// 長整数型の定義
        float floatVar;	 	// 単精度浮動小数点数型の定義
        double doubleVar;	// 倍精度浮動小数点数型の定義
        char charVar; 		// 文字型のの定義
        String stringVar; 	// 文字列型の定義
        boolean booleanVar; // ブーリアン型の定義
		
		
        // 初期値を代入し初期化
        byteVar = 0; 		// バイト型の変数
        shortVar = 0; 		// 短整数型の変数
        intVar = 0; 		// 整数型の変数
        longVar = 0L; 		// 長整数型の変数
        floatVar = 0.0f;	// 単精度浮動小数点数型の変数
        doubleVar = 0.0;	// 倍精度浮動小数点数型の変数
        charVar = '\u0000'; // 文字型の変数
        stringVar = null;	// 文字列型の変数
        booleanVar = false; // ブーリアン型の変数
		
		
		
        // 問3
        // 値代入
        byteVar = 10;
        shortVar = 100;
        intVar = 1000;
        longVar = 10000L;
        floatVar = 9.5f;
        doubleVar = 10.5;
        charVar = 'a';
        stringVar = "ハロー";
        booleanVar = true;
		
        // 問4
        // コンソール出力
        System.out.println(longVar + intVar + shortVar + byteVar);// 11110
        System.out.println(byteVar * 2);// 20
        System.out.println(charVar + " " + stringVar + " " + booleanVar);//a ハロー true
        System.out.println(longVar + intVar + shortVar + byteVar + (int)(floatVar + doubleVar));// 数字を全て足す
        System.out.println(longVar * intVar * shortVar * byteVar);// 小数点以外の数字を全てかける
        System.out.println(doubleVar / 100); // 0.105 10.5割る100をする
        System.out.println(byteVar - shortVar);// 10引く100をする

        
        // 問5
        String num = "20";
        int num1 = 23;
        
        int num2 = Integer.parseInt(num);// numをint型に変換
        System.out.println("ハローJAVA"+(num2+num1));// コンソールに出力

        // 問6、7
        
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";
        
        double heightInMeters = height / 100.0;// 身長をメートルに変換
        double bmi = weight / (heightInMeters * heightInMeters);// BMIの計算

        
        System.out.println("「初めまして" + name + "です」");// 「初めまして○○です」
        System.out.println("「年齢は" + age + "歳です」");// 「年齢は○○歳です」
        System.out.println("「身長は" + height + "cmです」");// 「身長は○○cmです」
        System.out.println("「体重は" + weight + "kgです」");// 「体重は○○kgです」
        System.out.println("「好きな食べ物は" + favoriteFood + "です」");// 「好きな食べ物は○○です」
        System.out.printf("「BMIは%.1fです」%n", bmi);  // 「BMIは○○です」
		

        // 問8~13

        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2; 
        favoriteFood = "オムライス";


        // 年齢・身長・体重の自己代入（和算）
        age += age;  // 24 + 24 = 48
        height += height;  // 168.5 + 168.5 = 337.0
        weight += weight;  // 64.2 + 64.2 = 128.4

        
        heightInMeters = height / 100.0;// 身長をメートルに変換
        bmi = weight / (heightInMeters * heightInMeters);// BMIの計算
        
        // 【年齢・身長・体重】を文字列型に型変換        
        String combined = String.valueOf(age) + String.valueOf(height) + String.valueOf(weight);
        
        // 【年齢・身長】を整数型に変換して出力
        int ageAsInt = age;  // 年齢は既に整数型なのでそのまま使用
        int heightAsInt = (int) height;  // 身長の小数点部分を切り捨てて整数型に変換


        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.printf("BMIは%.1fです%n", bmi);

        System.out.println(age >= 25 ? true : false);// 年齢が25歳以上ならtrue
        System.out.println(combined);// 【年齢・身長・体重】を文字列型に型変換し繋げて出力

        System.out.println(ageAsInt); // 整数型に変換された【年齢】を出力
        System.out.println(heightAsInt); // 整数型に変換された【身長】を出力
        System.out.println(age >= 25 || height >= 160 ? true : false);// 【年齢が25もしくは身長が160以上】であればtrueを出力


	}

}
