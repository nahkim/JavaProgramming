import java.util.InputMismatchException;
import java.util.Scanner;

public class Song {
	public String title;	// �뷡����  �ʵ� (����)
	public String artist;	// ����
	public String country;	// ����
	public int year;		// ��ǥ�⵵
	
	public Song()	// �⺻ ������(�ʱ�ȭ)
	{
	}
	
	public Song(String t, String a, String c, int y)	// �Ű����� �ִ� ������
	{
		title = t;
		artist = a;
		country = c;
		year = y;
	}
	
	public void show()	// �뷡 ���� ��� �޼ҵ�
	{
		System.out.println(year + "��, " + country + " ������ " + artist + "�� �θ� \"" + title + "\"");
	}

	public static void main(String[] args) {

		Song info;		// ���۷��� ���� ����
		String title;
		String country;
		String artist;
		int year;
		
		Scanner scanner = new Scanner(System.in);	// scanner ����
		System.out.println("�뷡 �Ѱ� ����");
		System.out.println("��ǥ�⵵ ���� ���� �뷡����");
		while (true)
		{
			try
			{
				year = scanner.nextInt();
				break ;
			}
			catch(InputMismatchException e)		// ���� ó�� (�Է� ����)
			{
				System.out.println("��ǥ�⵵���� ������ �Է��ϼ���");
				scanner.nextLine();
			}
		}
		country = scanner.next();
		artist = scanner.next();
		title = scanner.nextLine();
		info = new Song(title, artist, country, year);
		info.show();		// �뷡 ���� ���
		scanner.close();	// scanner �ݱ�
	}

}
