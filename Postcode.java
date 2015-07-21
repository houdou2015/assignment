import java.util.Scanner;
public class Postcode {
	public static void main(String[] args) {
		System.out.println("请输入6位邮政编码:");	
		Scanner san=new Scanner(System.in);
		String in=san.nextLine();
		getMatch(in);                                      //调用getMatch(in)函数
	}

	private static void getMatch(String s) {
		String regex = "[0-9]{6}";
		if(s.matches(regex)){                           //是否满足上面的正则表达式
			System.out.println("该邮z政编码合法！");	
		}
		else{
			System.out.println("该邮政编码不合法！");
		}
	}	
}