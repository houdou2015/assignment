import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email {
	public static void main(String[] args) {
		System.out.println("������һ�������ַ:��");
		Scanner san=new Scanner(System.in);
		String isNum=san.nextLine();
		getMatch(isNum);
	}
	private static void getMatch(String isNum) {
		Pattern p=Pattern.compile("^[0-9a-zA-Z]+@[a-zA-Z0-9\\-]+\\.[0-9a-zA-Z\\-]+$");  //����һ��ģʽ
		Matcher m=p.matcher(isNum);                                                     //����һ��ƥ����
		boolean b=m.matches();                                                      //�����ж�
		if(b=true){                                                                 //�Ƿ����������������ʽ
			System.out.println("�������ַ�Ϸ���");	
		}
		else{
			System.out.println("�������ַ���Ϸ���");
		}	
	}
}
