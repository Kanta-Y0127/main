package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*
		 * [概要] 入力した商品の残り台数が出力される処理
		 * [詳細] 入力した商品の残り台数をコンソールに0～11までのランダム値で表示する。
		 * */
		Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String input = scanner.nextLine();
        
        // 入力された値を「、」で分割して配列に格納
        String[] products = input.split("、");
        
        // 拡張for文で商品ごとに処理
        Random random = new Random();
        for (String product : products) {
            product = product.trim(); // 空白を削除

            int remaining = random.nextInt(12); // 0〜11のランダムな値
            String result = "";

            switch (product) {
                case "テレビ":
                case "ディスプレイ":
                    int displayRemaining = 11 - random.nextInt(12);
                    result = product.equals("テレビ") 
                            ? "テレビの残り台数は" + displayRemaining + "台です" 
                            : "ディスプレイの残り台数は" + displayRemaining + "台です";
                    break;
                case "パソコン":
                    result = "パソコンの残り台数は" + remaining + "台です";
                    break;
                case "冷蔵庫":
                    result = "冷蔵庫の残り台数は" + remaining + "台です";
                    break;
                case "扇風機":
                    result = "扇風機の残り台数は" + remaining + "台です";
                    break;
                case "洗濯機":
                    result = "洗濯機の残り台数は" + remaining + "台です";
                    break;
                case "加湿器":
                    result = "加湿器の残り台数は" + remaining + "台です";
                    break;
                default:
                    result = "『 " + product + " 』は指定の商品ではありません";
            }

            // 結果を出力
            System.out.println(result);
            System.out.println();
        }
    }
}
