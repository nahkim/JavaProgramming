import java.util.InputMismatchException;
import java.util.Scanner;

public class Work2 {
	public String title;	// 노래제목  필드 (변수)
	public String artist;	// 가수
	public String country;	// 국적
	public int year;		// 발표년도
	
	public Work2()	// 기본 생성자(초기화)
	{
		title = "";
		artist = "";
		country = "";
		year = 0;
	}
	
	public Work2(int check)	// 매개변수 있는 생성자
	{
		title = "";
		artist = "";
		country = "알 수 없는";
		year = 0;
	}
	
	public void show()	// 노래 정보 출력 메소드
	{
		System.out.println(year + "년, " + country + " 국적의 " + artist + "가 부른 \"" + title + "\"");
	}

	public static void main(String[] args) {

		Work2 info;		// 레퍼런스 변수 선언
		int check;

		Scanner scanner = new Scanner(System.in);	// scanner 열기
		System.out.println("노래 한곡 정보");
		System.out.println("국적을 모를시 아무 숫자 입력, 아니라면 1입력");		// 매개변수 있는 생성자를 사용하려 만듬
		check = scanner.nextInt();
		if (check == 1)
		{
			info = new Work2();		// Work2 객체 생성
		}
		else
		{
			info = new Work2(check);	// Work2 객체 생성
		}
		System.out.println("발표년도를 입력하세요");
		while (true)
		{
			try
			{
				info.year = scanner.nextInt();
				break ;
			}
			catch(InputMismatchException e)		// 예외 처리 (입력 오류)
			{
				System.out.println("정수를 입력하세요");
				scanner.nextLine();
			}
		}
		scanner.nextLine();
		if (check == 1)							// 국적을 알 경우에만 입력 받음
		{
			System.out.println("국적을 입력하세요");
			info.country = scanner.nextLine();
		}
		System.out.println("가수를 입력하세요");
		info.artist = scanner.nextLine();
		System.out.println("노래 제목을 입력하세요");
		info.title = scanner.nextLine();
		
		info.show();		// 노래 정보 출력
		scanner.close();	// scanner 닫기
	}

}
