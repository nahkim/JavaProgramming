import java.util.InputMismatchException;
import java.util.Scanner;

public class Song {
	public String title;	// 노래제목  필드 (변수)
	public String artist;	// 가수
	public String country;	// 국적
	public int year;		// 발표년도
	
	public Song()	// 기본 생성자(초기화)
	{
	}
	
	public Song(String t, String a, String c, int y)	// 매개변수 있는 생성자
	{
		title = t;
		artist = a;
		country = c;
		year = y;
	}
	
	public void show()	// 노래 정보 출력 메소드
	{
		System.out.println(year + "년, " + country + " 국적의 " + artist + "가 부른 \"" + title + "\"");
	}

	public static void main(String[] args) {

		Song info;		// 레퍼런스 변수 선언
		String title;
		String country;
		String artist;
		int year;
		
		Scanner scanner = new Scanner(System.in);	// scanner 열기
		System.out.println("노래 한곡 정보");
		System.out.println("발표년도 국적 가수 노래제목");
		while (true)
		{
			try
			{
				year = scanner.nextInt();
				break ;
			}
			catch(InputMismatchException e)		// 예외 처리 (입력 오류)
			{
				System.out.println("발표년도에는 정수를 입력하세요");
				scanner.nextLine();
			}
		}
		country = scanner.next();
		artist = scanner.next();
		title = scanner.nextLine();
		info = new Song(title, artist, country, year);
		info.show();		// 노래 정보 출력
		scanner.close();	// scanner 닫기
	}

}
