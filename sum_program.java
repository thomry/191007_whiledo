import java.util.*; //Scanner�� import

public class sum_program {

public static void main(String[] args) {
	int num;
	int sum = 0;
	boolean flag = true;                      //while���� ���ǽ����� ���� ����
	Scanner scanner = new Scanner(System.in);
			
	System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�)");
			
	while(flag) {                            //flag=true�̹Ƿ� ���ǽ� ��
		System.out.print(">>");
				
		String tmp = scanner.nextLine();     //�Է¹��� ���ڿ��� tmp�� ����
		num = Integer.parseInt(tmp);         //���ڿ� tmp�� ���� int�� ��ȯ�ؼ� num������ ����
				
		if(num != 0) {
			sum += num;                      //num�� 0�� �ƴϸ� sum�� num�� ��� ����
		}else {
			flag = false;                    //num�� 0�̸� flag�� false�� �Ǹ鼭 while���ǹ��� �������� �����.
		}

	}
			
	System.out.println("�հ�:"+sum);

}

}
