import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Name {
	public static void main(String[] args)  {
		System.out.println("������һ��Ӣ�����֣�");
		Scanner san=new Scanner(System.in);
		String isName=san.nextLine();
		getMatch(isName);
	}
	private static void getMatch(String s) {
		/*  Pattern p=Pattern.compile("[A-Z][a-z]+\\s+[A-Z][a-z]+");                    //����һ��ģʽ
			Matcher m=p.matcher(s);                                                     //����һ��ƥ����
			boolean b=m.matches();                                                      //�����ж�
			if(b=true){                                        //�Ƿ����������������ʽ
				System.out.println("��Ӧ�����ֺϷ�����");	
			}
				else{
					System.out.println("��Ӧ�����ֲ��Ϸ���");
				}*/
		String regex="[A-Z][a-z]+\\s+[A-Z][a-z]+";
		String regex1="^[A-Z][a-z]+\\s+[A-Z][a-z]+\\s+[A-Z][a-z]+$";
		if(s.matches(regex)||s.matches(regex1)){                                        //�Ƿ����������������ʽ
			System.out.println("��Ӣ�����ֺϷ�����");	
		}
		else{
			System.out.println("��Ӣ�����ֲ��Ϸ���");
		}
	}
}