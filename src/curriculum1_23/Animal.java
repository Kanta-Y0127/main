package curriculum1_23;

public class Animal {

    // フィールド (動物名、体長、速度)
    private String name;
    private Double length;
    private Integer speed;

    // 名前を設定するセッターメソッド
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "nullチェック";  // nullまたは空文字の場合はnull表示
        }
    }

    // 名前を取得するゲッターメソッド
    public String getName() {
        return (this.name != null) ? this.name : "null";
    }

    // 体長を設定するセッターメソッド
    public void setLength(Double length) {
        if (length != null && length > 0) {
            this.length = length;
        } else {
            this.length = null;  // nullチェック
        }
    }

    // 体長を取得するゲッターメソッド
    public Double getLength() {
        return (this.length != null) ? this.length : null;  // nullチェック
    }

    // 速度を設定するセッターメソッド
    public void setSpeed(Integer speed) {
        if (speed != null && speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = null;  // nullチェック
        }
    }

    // 速度を取得するゲッターメソッド
    public Integer getSpeed() {
        return (this.speed != null) ? this.speed : null;  // nullチェック
    }
}
