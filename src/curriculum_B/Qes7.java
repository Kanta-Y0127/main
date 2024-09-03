package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * [概要] N人の生徒の成績を管理するプログラム処理
		 * [詳細] 各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を表示する。
		 * */
        Scanner scanner = new Scanner(System.in);

        // 生徒の人数を入力
        int numStudents;
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            numStudents = scanner.nextInt();
        } while (numStudents < 2);  // 2以上の人数が入力されるまで繰り返し

        // 各科目の合計点を格納する変数
        int totalEnglish = 0, totalMath = 0, totalScience = 0, totalSocialStudies = 0;
        
        // 全体の合計点を格納する変数
        int grandTotal = 0;

        // 各生徒の平均点を格納する配列
        double[] studentAverages = new double[numStudents];

        // 各生徒の点数を入力
        for (int i = 1; i <= numStudents; i++) {            
            System.out.print(i + "人目の『英語』の点数を入力してください: ");
            int english = scanner.nextInt();
            totalEnglish += english;
            
            System.out.print(i + "人目の『数学』の点数を入力してください: ");
            int math = scanner.nextInt();
            totalMath += math;
            
            System.out.print(i + "人目の『理科』の点数を入力してください: ");
            int science = scanner.nextInt();
            totalScience += science;
            
            System.out.print(i + "人目の『社会』の点数を入力してください: ");
            int socialStudies = scanner.nextInt();
            totalSocialStudies += socialStudies;
            
            // 各生徒の平均点を計算し、配列に格納
            double studentAverage = (english + math + science + socialStudies) / 4.0;
            studentAverages[i - 1] = studentAverage;
            grandTotal += (english + math + science + socialStudies);
            
            System.out.println();// 空白行の挿入
        }

        // 各教科の平均点を計算
        double averageEnglish = totalEnglish / (double)numStudents;
        double averageMath = totalMath / (double)numStudents;
        double averageScience = totalScience / (double)numStudents;
        double averageSocialStudies = totalSocialStudies / (double)numStudents;

        // 全体の平均点を計算
        double overallAverage = grandTotal / (double)(numStudents * 4);

        // 各生徒の平均点を出力
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, studentAverages[i]);
        }
        
        System.out.println();// 空白行の挿入
        
        // 各教科の平均点と全体の平均点を出力
        System.out.printf("英語の平均点は%.2f点です。\n", averageEnglish);
        System.out.printf("数学の平均点は%.2f点です。\n", averageMath);
        System.out.printf("理科の平均点は%.2f点です。\n", averageScience);
        System.out.printf("社会の平均点は%.2f点です。\n", averageSocialStudies);
        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
        
        scanner.close();
    }
}