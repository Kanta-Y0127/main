package processpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProcessClass {

    // フィールド
    private String message1;
    private String message2;
    private String message3;
    private String dateTime;

    // コンストラクタでフィールドの初期化（NULLチェック含む）
    public ProcessClass(String message1, String message2, String message3) {
        // thisを使ってフィールドに代入、NULLチェック
        this.message1 = (message1 != null) ? message1 : "メッセージが指定されていません";
        this.message2 = (message2 != null) ? message2 : "メッセージが指定されていません";
        this.message3 = (message3 != null) ? message3 : "メッセージが指定されていません";

        // 現在日時のフォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.dateTime = sdf.format(new Date());  // 現在日時をフィールドに格納
    }

    // メッセージ出力メソッド
    public void printMessages() {
        // NULLチェック
        if (this.message1 != null) {
            System.out.println(this.message1);
        } else {
            System.out.println("message1がnullです");
        }

        if (this.message2 != null) {
            System.out.println(this.message2);
        } else {
            System.out.println("message2がnullです");
        }

        if (this.message3 != null) {
            System.out.println(this.message3);
        } else {
            System.out.println("message3がnullです");
        }

        if (this.dateTime != null) {
            System.out.println("今の現在日時は" + this.dateTime + "です");
        } else {
            System.out.println("日時情報が取得できませんでした");
        }
    }
}