package while_prac;

public class FlowEx29 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {          //int�� 100���� ���ų� �������� i���� 1�� ������
			System.out.printf("i=%d", i);
			
			int tmp = i;                         //���� tmp�� i�� ����
			
			do {                                 //tmp %10�� ���� 3�ǹ������ �ƴ��� Ȯ���մϴ�.(0����)
				if(tmp%10%3 == 0 && tmp%10 != 0) {
					System.out.print("¦");       //¦�� �Ǻ�
				}                                //tmp /= 10�� tmp /10�� �����ϴ�.
			}while ((tmp /= 10)!= 0);
			
			System.out.println();
		}                                        //for

	}                                            //main

}
