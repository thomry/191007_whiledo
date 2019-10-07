package while_prac;

public class FlowEx29 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {          //int가 100보다 같거나 작을동안 i값이 1씩 증가함
			System.out.printf("i=%d", i);
			
			int tmp = i;                         //변수 tmp에 i값 저장
			
			do {                                 //tmp %10한 것이 3의배수인지 아닌지 확인합니다.(0제외)
				if(tmp%10%3 == 0 && tmp%10 != 0) {
					System.out.print("짝");       //짝수 판별
				}                                //tmp /= 10은 tmp /10과 같습니다.
			}while ((tmp /= 10)!= 0);
			
			System.out.println();
		}                                        //for

	}                                            //main

}
