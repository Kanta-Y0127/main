package processpackage;

// PlayerクラスがCharacterクラスを継承
public class Player extends Character {

    // コンストラクタで名前を受け取り、スーパークラスのコンストラクタ呼び出し
    public Player(String name) {
        super(name);
    }

    // メッセージ表示
    public void greet() {
        System.out.println("こんにちは 「" + getName() + "」 さん");
    }
}
