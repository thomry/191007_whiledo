package while_prac;

public class FlowEx23 {

	public static void main(String[] args) {
		int i =5;
		
		while(i--!=0) { //4~0까지하고 완료됨
			System.out.println(i + " - I can do it.");
		}
		while(--i!=0) { //무한루프
			System.out.println(i + " - I can do it.");
		}

	}

}
