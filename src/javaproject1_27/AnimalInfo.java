package javaproject1_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalInfo {

    // 学名を格納するマップ
    private static Map<String, String> scientificNames = new HashMap<>();

    // 学名を初期化する
    static {
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        // インコは学名が不明なので追加しない
    }

    public static void main(String[] args) {
        // コンソール入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください:");
        String input = scanner.nextLine();
        
        // 入力された文字列を動物ごとに分割
        String[] animalsData = input.split(",");

        // 各動物の情報を処理する
        for (String animalData : animalsData) {
            // 動物名、体長、速度を分割
            String[] attributes = animalData.split(":");
            String name = attributes[0];      // 動物名
            double length = Double.parseDouble(attributes[1]); // 体長
            int speed = Integer.parseInt(attributes[2]); // 速度

            // 学名を取得、ない場合は"不明"
            String scientificName = scientificNames.getOrDefault(name, null);

            // Animalクラスのインスタンスを作成
            Animal animal = new Animal(name, length, speed, scientificName);

            // 動物情報を表示
            animal.showInfo();
        }

        // Scannerを閉じる
        scanner.close();
    }
}
