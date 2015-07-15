import java.util.*;
public class Day {
	public  static int getdays(int year){
		if((year%100==0 && year%400==0)||(year%100!=0 && year%4==0))
		{return 366;}
		else
		{return 355;}
	}		
	public static boolean isNumeric(String str){
		for (int i = str.length();--i>=0;){   
			if (!Character.isDigit(str.charAt(i))){                     //�ж�str.charAt(i)�Ƿ���һ���ַ���
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner ii=new Scanner(System.in);
		String num;
		do{
			System.out.print("������һ�����:");
			Scanner san=new Scanner(System.in);                     
			String year=san.next();                               
			boolean y=isNumeric(year);                             //���ò�������
			if(y==true) {int yy=Integer.parseInt(year);           //���ַ�������ת��������                              
			System.out.println(getdays(yy));
			}
			else System.out.println("error!!!");
			System.out.println("continue? yes--y no--n");
			num=ii.next();                                           //�ж��Ƿ����
		}while(num.equals("y"));
	}
}
