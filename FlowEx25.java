package while_prac;
import java.util.*; //Scanner import

public class FlowEx25 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //�Է¹��� ������ tmp�� ����
		num = Integer.parseInt(tmp);     //�Է¹��� ���ڿ��� int�� ��ȯ�Ͽ� num�� ����
		
		while(num != 0) {
			sum += num%10;               //num�� 10���� ���� �������� sum�� ����
			System.out.printf("sum=%3d num=%d%n",sum,num);
			
			num /= 10;                   //num�� 10���� ���� ���� �ٽ� num�� ����
		}
		
		System.out.println("�� �ڸ����� ��:"+sum);

	}

}
