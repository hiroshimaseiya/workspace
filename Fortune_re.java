import java.util.Scanner;

public class Fortune_re{
	public static void main(String[] args){
		System.out.println("占いの館");
		System.out.println("あなたの名前を入力してください");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("あなたの年齢を入力してください");
		int age = sc.nextInt();

		int fortune = new java.util.Random().nextInt(4);
		fortune++;

		System.out.println("占い結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");

		switch(fortune){
			case 1:
				System.out.println(name +"さんは、大吉です！");
				break;
			case 2:
				System.out.println(name +"さんは、中吉です！");
				break;
			case 3:
				System.out.println(name +"さんは、吉！");
				break;
			default:
				System.out.println(name +"さんは、凶です");
		}
	}
}