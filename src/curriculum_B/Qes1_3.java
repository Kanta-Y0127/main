package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * [概要] ログイン時の入力チェックシステム処理
		 * [詳細] コンソールにユーザー名を入力できるようにする。
		 * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String username = scanner.nextLine();

        // [概要] コンソール入力時イベント
        
        // 文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
        if (username == null || username.length() == 0) {
            System.out.println("「名前を入力してください」");
            return;
            
        // 文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
        } else if (username.length() > 10) {
            System.out.println("「名前を10文字以内にしてください」");
            return;
            
        // 半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
        } else if (!username.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("「半角英数字のみで名前を入力してください」");
            return;
            
        // 正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
        } else {
            System.out.println("ユーザー名「" + username + "」を登録しました");
        }


        // [概要] じゃんけん開始イベント
        Random random = new Random();
        int attempts = 0;  // じゃんけんを行った回数

        while (true) {
            // 自分の手をランダムに決定
            int userHand = random.nextInt(3);
            // 相手の手をランダムに決定
            int opponentHand = random.nextInt(3);

            // ユーザーの手と相手の手を出力
            System.out.println(username + "の手は「" + getHandName(userHand) + "」");
            System.out.println("相手の手は「" + getHandName(opponentHand) + "」");

            attempts++;  // じゃんけんの回数をカウント

            // じゃんけん　勝敗の判定
            if (userHand == opponentHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if ((userHand == 0 && opponentHand == 1) ||  // グー vs チョキ
                       (userHand == 1 && opponentHand == 2) ||  // チョキ vs パー
                       (userHand == 2 && opponentHand == 0)) {  // パー vs グー
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                break;  // じゃんけんに勝ったらループを終了
            } else {
                System.out.println("俺の勝ち！");
                switch (opponentHand) {
                    case 0:
                        System.out.println("負けは次につながるチャンスです！");
                        System.out.println("ネバーギブアップ！");
                        break;
                    case 1:
                        System.out.println("たかがじゃんけん、そう思ってないですか？");
                        System.out.println("それやったら次も、俺が勝ちますよ");
                        break;
                    case 2:
                        System.out.println("なんで負けたか、明日まで考えといてください。");
                        System.out.println("そしたら何かが見えてくるはずです");
                        break;
                }
            }
        }

        // じゃんけん勝つまでの合計回数を表示
        System.out.println("勝つまでにかかった合計回数は" + attempts + "回です");
        scanner.close();
    }

    // じゃんけん　手を取得する
    private static String getHandName(int hand) {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return "";
        }
    }
}