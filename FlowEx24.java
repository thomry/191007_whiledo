package while_prac;

public class FlowEx24 {

	public static void main(String[] args) {
		int i = 11;
		
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
		
		while (i-- != 0) {
			System.out.println(i);
			
			for(int j = 0; j<2_000_000_000;j++) { //���ǽİ� �������� 2,000,000,000��ŭ �ݺ��ϸ� �ð��� ����
				; //���� �ٷ� FOR���� �� {}���� ǥ���ص� ��.
			}
		}
		System.out.println("GAME OVER");

	}

}
