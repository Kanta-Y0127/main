package curriculum1_23;

public class MainClass {
    public static void main(String[] args) {
        // Animalクラスのインスタンスを作成
        Animal lion = new Animal();

        // セッターメソッドを使って値を設定
        lion.setName("ライオン");// 名前
        lion.setLength(2.1); // 体長
        lion.setSpeed(80); // 速度

        // ゲッターメソッドを使って値を取得して表示
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
