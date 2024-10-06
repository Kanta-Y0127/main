package javaproject1_27;

// Animalクラス
class Animal {
    private String name;      // 動物名
    private double length;    // 体長
    private int speed;        // 速度
    private String scientificName;  // 学名

    // コンストラクタ
    public Animal(String name, double length, int speed, String scientificName) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.scientificName = scientificName;
    }

    // 情報出力メソッド
    public void showInfo() {
        System.out.println("動物名：" + name);
        System.out.println("体長：" + length + "m");
        System.out.println("速度：" + speed + "km/h");
        System.out.println("学名：" + (scientificName != null ? scientificName : "不明"));
        System.out.println();  // 空行で区切る
    }
}

