package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		public static void printMessage(String message,int version) {
			System.out.println(message + " " + version);
		}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		public static void multiply(int a,int b) {
			System.out.println(a * b);
		}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		public static void printArray(int[] array) {
			for (int num : array) {
				System.out.println(num);
			}
		}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		public static void multiply(double a, double b) {
			System.out.println(a + b);
		}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	    public static int[] generateRandomNumbers(int count) {
	        Random random = new Random();
	        int[] numbers = new int[count];

	        for (int i = 0; i < count; i++) {
	            int num;
	            do {
	                num = random.nextInt(101);  // 0～100までの乱数を生成
	            } while (num == 0);
	            numbers[i] = num;
	            System.out.println(num);
	        }

	        return numbers;
	    }

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	    public static double calculateAverage(int[] numbers) {
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        double average = (double) sum / numbers.length;
	        System.out.println(average);
	        return average;
	    }
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	    public static boolean isAboveFifty(double value) {
	        boolean result = value >= 50;
	        System.out.println(result);
	        return result;
	    }

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
	// Q1
		System.out.println("Q1");
		printMessage("Hello JavaSE",11);
		System.out.println();
		
	// Q2
		System.out.println("Q2");
		multiply(6,5);
		System.out.println();
	
	// Q3
		System.out.println("Q3");
		int[] array = {5,10,15,77};
		printArray(array);
		System.out.println();

		
	// Q4
		System.out.println("Q4");
		multiply(1.28,3.72);
		System.out.println();

	// Q5
		System.out.println("Q5");
        int[] randomNumbers = generateRandomNumbers(3);
		System.out.println();
	
	// Q6
		System.out.println("Q6");
        double average = calculateAverage(randomNumbers);
		System.out.println();
		
	// Q7
		System.out.println("Q7");
        isAboveFifty(average);
		System.out.println();
	}
}