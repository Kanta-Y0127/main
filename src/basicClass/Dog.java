package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
    private String name;

	
	// Q2：フィールドに動物の数の変数を定義してください。
    private int count;

	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    public Dog(String name) {
        this.name = name;  // コンストラクタで名前を代入
    }
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
    public Dog(String name, int count) {
        this.name = name;
        this.count = count;
    }

    // 名前を取得するためのゲッターメソッド
    public String getName() {
        return name;
    }

    // 数を取得するためのゲッターメソッド
    public int getCount() {
        return count;
    }
	
}
