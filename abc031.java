import java.util.Scanner;

public class abc031{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();

		int sumA = ((a + 1)* d);
		int sumD = (a * (d + 1));

		if(sumA > sumD){
			System.out.println(sumA);
		}else if(sumA < sumD){
			System.out.println(sumD);
		}else{
			System.out.println(sumA);
		}
	}
}