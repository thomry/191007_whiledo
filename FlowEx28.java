package while_prac;
import java.util.*; //Scanner import

public class FlowEx28 {

	public static void main(String[] args) {
		int input = 0, answer = 0; //���� �ʱⰪ
		
		answer = (int)(Math.random()*100) + 1 ;    //1~100������ �������� answer ������ ����
		Scanner scanner = new Scanner(System.in);
		
		do {                                       //�Է¹��� ���� answer���� ���� �������� ������� ����
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();             //�Է¹��� ���� ���� input�� ����
			
			if(input>answer) {                     //�Է¹��� ���� ������ ������ ������ Ŭ��
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			}else if(input<answer) {               //�Է¹��� ���� ������ ������ ������ ���� ��
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
			
		}while(input != answer);
		
		System.out.println("�����Դϴ�.");            //�Է¹��� ���� ������ ���� ���� ��

	}

}
