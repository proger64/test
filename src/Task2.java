import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int otr=0;
		int pol=0;
		int nol=0;
		
		for(int i=1;i<=5;i++){
			Scanner sc=new Scanner(System.in);
			int x = sc.nextInt();
			if(x>0)
				pol++;
			else if(x<0)
				otr++;
			else
				nol++;
				
		}
		System.out.println("Положительных - "+pol);
		System.out.println("Отрицательных - "+otr);
		System.out.println("Нулей - "+nol);
	}
}
