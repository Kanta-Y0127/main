package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * [概要] 001*001～020*009の掛け算　コンソール表示処理
		 * [詳細] コンソールに001*001～020*009の掛け算をforループで表示する。
		 * */
        for (int i = 1; i <= 9; i++) {  // 縦9行（1から9）
            for (int j = 1; j <= 20; j++) {  // 横20列（1から20）
                // 計算結果を表示（ゼロ埋めで3桁表示、結果は3桁表示）
                System.out.printf("%03d * %03d = %03d", j, i, i * j);

                // 最後の列以外に " || " を追加
                if (j < 20) {
                    System.out.print(" || ");
                }
            }
            System.out.println();  // 各行の最後で改行
        }
    }
}