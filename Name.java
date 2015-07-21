import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Name {
	public static void main(String[] args)  {
		System.out.println("请输入一个英文名字：");
		Scanner san=new Scanner(System.in);
		String isName=san.nextLine();
		getMatch(isName);
	}
	private static void getMatch(String s) {
		/*  Pattern p=Pattern.compile("[A-Z][a-z]+\\s+[A-Z][a-z]+");                    //构建一个模式
			Matcher m=p.matcher(s);                                                     //建造一个匹配器
			boolean b=m.matches();                                                      //进行判断
			if(b=true){                                        //是否满足上面的正则表达式
				System.out.println("该应文名字合法！！");	
			}
				else{
					System.out.println("该应文名字不合法！");
				}*/
		String regex="[A-Z][a-z]+\\s+[A-Z][a-z]+";
		String regex1="^[A-Z][a-z]+\\s+[A-Z][a-z]+\\s+[A-Z][a-z]+$";
		if(s.matches(regex)||s.matches(regex1)){                                        //是否满足上面的正则表达式
			System.out.println("该英文名字合法！！");	
		}
		else{
			System.out.println("该英文名字不合法！");
		}
	}
}