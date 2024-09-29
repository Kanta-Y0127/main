package processpackage;

import java.util.Random;

public class Character {
    // フィールド（名前、HP、MP、攻撃力、素早さ、防御力）
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;

    // コンストラクタで名前を受け取る
    public Character(String name) {
        this.name = name;
        generateStats();  // ステータスをランダム生成
    }

    // ステータスをランダム生成
    private void generateStats() {
        Random random = new Random();
        this.hp = random.nextInt(1000);     // 0〜999の間でHP
        this.mp = random.nextInt(1000);     // 0〜999の間でMP
        this.attack = random.nextInt(1000);  // 0〜999の間で攻撃力
        this.speed = random.nextInt(1000);  // 0〜999の間で素早さ
        this.defense = random.nextInt(1000); // 0〜999の間で防御力
    }

    // getterとsetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    // ステータス表示
    public void showStats() {
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAttack());
        System.out.println("素早さ：" + getSpeed());
        System.out.println("防御力：" + getDefense());
    }
}
