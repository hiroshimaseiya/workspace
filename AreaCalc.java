import java.util.Scanner;

public class AreaCalc{
	public static void main(String[] args){
		System.out.println("【面積計算機】");
		System.out.println("★三角形の面積を求める場合は「1」を入力してください");
		System.out.println("★円の面積を求める場合は「2」を入力してください");
		System.out.println("★プログラムを終了する場合は「3」を入力してください");

		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select){
			case 1:
				System.out.println("三角形の面積を求めます");

				System.out.println("底辺の値を入力してください");
				int bottom = sc.nextInt();

				System.out.println("高さの値を入力してください");
				int height = sc.nextInt();

				double ans1 = AreaCalc_logic.calcTriangleArea(bottom, height);
				System.out.println("三角形の面積は、" + ans1 + "cm2です");
				System.out.println("プログラムを終了します");

				break;

			case 2:
				System.out.println("円の面積を求めます");

				System.out.println("半径の値を入力してください");
				int radius = sc.nextInt();

				double ans2 = AreaCalc_logic.calcCicleArea(radius);
		
				System.out.println("円の面積は、" + ans2 + "cm2です");
				System.out.println("プログラムを終了します");

				break;

			default:
				System.out.println("プログラムを終了します");
				break;
		}
	}
}