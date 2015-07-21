import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email {
	public static void main(String[] args) {
		System.out.println("请输入一个邮箱地址:：");
		Scanner san=new Scanner(System.in);
		String isNum=san.nextLine();
		getMatch(isNum);
	}
	private static void getMatch(String isNum) {
		Pattern p=Pattern.compile("^[0-9a-zA-Z]+@[a-zA-Z0-9\\-]+\\.[0-9a-zA-Z\\-]+$");  //构建一个模式
		Matcher m=p.matcher(isNum);                                                     //建造一个匹配器
		boolean b=m.matches();                                                      //进行判断
		if(b=true){                                                                 //是否满足上面的正则表达式
			System.out.println("该邮箱地址合法！");	
		}
		else{
			System.out.println("该邮箱地址不合法！");
		}	
	}
}
