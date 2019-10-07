package while_prac;
import java.util.*; //Scanner import

public class FlowEx28 {

	public static void main(String[] args) {
		int input = 0, answer = 0; //변수 초기값
		
		answer = (int)(Math.random()*100) + 1 ;    //1~100사이의 랜덤값을 answer 변수에 저장
		Scanner scanner = new Scanner(System.in);
		
		do {                                       //입력받을 값과 answer값이 같지 않을동안 문장들을 수행
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();             //입력받은 값을 변수 input에 저장
			
			if(input>answer) {                     //입력받은 값이 임의의 정해진 수보다 클때
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input<answer) {               //입력받은 값이 임의의 정해진 수보다 작을 때
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
			
		}while(input != answer);
		
		System.out.println("정답입니다.");            //입력받은 값이 임의의 수와 같을 때

	}

}
