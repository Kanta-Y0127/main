package mainpackage;

import processpackage.ProcessClass;

public class MainClass {

    public static void main(String[] args) {
        // Greetingクラスのインスタンスを作成し、メッセージを渡す（NULLチェックのテストを含む）
    	ProcessClass greeting = new ProcessClass("こんにちは！ここは日本です！","この寿司はうまい","寿司は和食です");

        // メッセージを出力
        greeting.printMessages();
    }
}
