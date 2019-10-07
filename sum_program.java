import java.util.*; //Scanner을 import

public class sum_program {

public static void main(String[] args) {
	int num;
	int sum = 0;
	boolean flag = true;                      //while문의 조건식으로 사용될 변수
	Scanner scanner = new Scanner(System.in);
			
	System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
			
	while(flag) {                            //flag=true이므로 조건식 참
		System.out.print(">>");
				
		String tmp = scanner.nextLine();     //입력받은 문자열을 tmp에 저장
		num = Integer.parseInt(tmp);         //문자열 tmp를 숫자 int로 변환해서 num변수에 저장
				
		if(num != 0) {
			sum += num;                      //num이 0이 아니면 sum에 num을 계속 더함
		}else {
			flag = false;                    //num이 0이면 flag이 false가 되면서 while조건문이 거짓으로 변경됨.
		}

	}
			
	System.out.println("합계:"+sum);

}

}
