import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int error = 0;
		for (int i = 0; i < 5; i++) {
			int x = (int) (Math.random() * (10 - 1) + 1);
			int y = (int) (Math.random() * (10 - 1) + 1);
			int r = x * y;
			System.out.println("���������:" + x + "*" + y + "=");
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			if (t != r) {
				System.out.println("�� ��������.���������� �����" + r);
				error++;
				
			}
		}
		System.out.println("�� ��������� "+error+" ������");
		if(error==0)
			System.out.println("���� ������ 5 ");
			
		
		else if (error==1)
			System.out.println("���� ������ 4");
		else if (error==2)
             System.out.println("���� ������ 3");
		else 
			System.out.println("���� ������ 2");
	}

}
