import java.util.InputMismatchException;
import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		System.out.println("연산을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num1, num2;		// 피연산자 저장 변수 (Operand Variables)
		String cal;			// 연산자 저장 변수  (Operator Variables)
		while (true)		// 종료조건이 나오기 전까지 무한 루프
		{
			try
			{
				num1 = scanner.nextInt();	// 피연산자 입력받기 (Receiving operands Inputs)
				cal = scanner.next();	// 연산자 입력받기 (Receiving Operator Inputs)
				num2 = scanner.nextInt();	// 피연산자 입력받기 (Receiving operands Inputs)
			}
			catch(InputMismatchException e)		// 예외 처리 (Input Error)
			{
				System.out.println("정수를 입력하세요");
				scanner.nextLine();
				continue ;
			}
			if (cal.equals("="))					// 종료 조건 (피연산자가 = 일경우 종료)
				break ;
			try
			{
				switch (cal)
				{
					case "+":	// 연산자가 + 일 경우
						System.out.println("결과: " + (num1 + num2));
						break ;
					case "-":	// 연산자가 - 일 경우
						System.out.println("결과: " + (num1 - num2));
						break ;
					case "*":	// 연산자가 * 일 경우
						System.out.println("결과: " + (num1 * num2));
						break ;
					case "/":	// 연산자가 / 일 경우
							System.out.println("결과: " + (num1 / num2));
							break ;
					case "%":	// 연산자가 % 일 경우
						System.out.println("결과: " + num1 % num2);
						break ;
					default:	// 정해진 연산자가 아닐 경우
						System.out.println("연산자 + - * / % 중 하나를 사용하세요");
				}
			}
			catch(ArithmeticException e)	// 에외 처리 (정수 0으로 나눌 때)
			{
				System.out.println("0으로 나눌 수 없습니다. 다시 업력하세요");
				scanner.nextLine();
				continue ;
			}
			
		}
		scanner.close();	// scanner 닫기
	}

}
