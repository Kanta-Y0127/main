package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * [概要] 九九処理
		 * [詳細] コンソールに九九をforループで表示する。
		 * */
        for (int i = 1; i <= 9; i++) { // 1から9までの数
            for (int j = 1; j <= 9; j++) { // 1から9までの数
                // 計算結果を表示（ゼロ埋めで2桁表示）
                System.out.printf("%02d * %02d = %02d", i, j, i * j);

                // 最後の列以外に " || " を追加
                if (j < 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println(); // 次の行に移動
        }
    }
}
