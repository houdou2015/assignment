import java.util.Scanner;
public class Postcode {
	public static void main(String[] args) {
		System.out.println("������6λ��������:");	
		Scanner san=new Scanner(System.in);
		String in=san.nextLine();
		getMatch(in);                                      //����getMatch(in)����
	}

	private static void getMatch(String s) {
		String regex = "[0-9]{6}";
		if(s.matches(regex)){                           //�Ƿ����������������ʽ
			System.out.println("����z������Ϸ���");	
		}
		else{
			System.out.println("���������벻�Ϸ���");
		}
	}	
}