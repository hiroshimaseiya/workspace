import java.util.*;

public class abc035{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();



		if((w % 16 == 0)&&(h % 9 == 0)){
			System.out.println("16:9");
		}else if((w % 4 == 0)&&(h % 3 == 0)){
			System.out.println("4:3");
		}else{
			System.out.println("ERROR");
		}
	}
}


