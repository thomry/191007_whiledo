package while_prac;

public class FlowEx24 {

	public static void main(String[] args) {
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while (i-- != 0) {
			System.out.println(i);
			
			for(int j = 0; j<2_000_000_000;j++) { //조건식과 증감식을 2,000,000,000만큼 반복하며 시간을 보냄
				; //빈문장 바로 FOR구문 옆 {}으로 표현해도 됨.
			}
		}
		System.out.println("GAME OVER");

	}

}
