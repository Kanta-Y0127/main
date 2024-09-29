package mainpackage;

import java.util.Scanner;

import processpackage.Player;

public class Main {
    public static void main(String[] args) {
        // ユーザーの名前入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前：");
        String playerName = scanner.nextLine();

        // Playerクラスのインスタンスを作成して名前を渡す
        Player player = new Player(playerName);

        // プレイヤーステータスを表示
        player.greet();
        player.showStats();

        // 出発メッセージ
        System.out.println("\nさあ冒険に出かけよう！");
    }
}
