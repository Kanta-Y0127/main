package data;

public class Prefecture {
    private String name;  // 都道府県名
    private String capital;  // 県庁所在地
    private double area;  // 面積

    // コンストラクタ
    public Prefecture(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    // ゲッター
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    // 都道府県の情報を表示
    public void showDetails() {
        System.out.println("都道府県名：" + name);
        System.out.println("県庁所在地：" + capital);
        System.out.println("面積：" + area + "km2");
        System.out.println(); 
    }
}
