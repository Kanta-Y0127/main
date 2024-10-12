package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import data.Prefecture;

public class Main {

    public static void main(String[] args) {
        // 都道府県データを作成
        List<Prefecture> prefectures = new ArrayList<>();
        prefectures.add(new Prefecture("北海道", "札幌市", 83424));
        prefectures.add(new Prefecture("青森県", "青森市", 9646));
        prefectures.add(new Prefecture("岩手県", "盛岡市", 15275));
        prefectures.add(new Prefecture("宮城県", "仙台市", 7282));
        prefectures.add(new Prefecture("秋田県", "秋田市", 11638));
        prefectures.add(new Prefecture("山形県", "山形市", 9323));
        prefectures.add(new Prefecture("福島県", "福島市", 13784));
        prefectures.add(new Prefecture("茨城県", "水戸市", 6097));
        prefectures.add(new Prefecture("栃木県", "宇都宮市", 6408));
        prefectures.add(new Prefecture("群馬県", "前橋市", 6362));
        prefectures.add(new Prefecture("埼玉県", "さいたま市", 3798));

        // コンソールから入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.println("都道府県の番号を入力：");
        String input = scanner.nextLine();

        System.out.println("昇順または降順を入力（面積順）：");
        String sortOrder = scanner.nextLine();

        // 入力された数字をリストに変換
        List<Integer> selectedIndexes = parseInput(input);

        // 選択された都道府県リストを作成
        List<Prefecture> selectedPrefectures = selectedIndexes.stream()
                .map(prefectures::get)
                .collect(Collectors.toList());

        // 面積で昇順または降順ソート
        if (sortOrder.equals("昇順")) {
            selectedPrefectures.sort(Comparator.comparing(Prefecture::getArea));
        } else if (sortOrder.equals("降順")) {
            selectedPrefectures.sort(Comparator.comparing(Prefecture::getArea).reversed());
        } else {
            System.out.println("無効なソート順が指定されました。");
            return;
        }

        // 結果を表示
        for (Prefecture prefecture : selectedPrefectures) {
            prefecture.showDetails();
        }

        scanner.close();
    }

    // 入力文字列を解析し、整数のリストに変換するメソッド
    private static List<Integer> parseInput(String input) {
        String[] tokens = input.split(",");
        List<Integer> result = new ArrayList<>();
        for (String token : tokens) {
            result.add(Integer.parseInt(token.trim()));
        }
        return result;
    }
}
