import java.util.*;
public class  Year{
	public static  boolean isLeap(int year){
		if(year%100==0){
			if(year%400==0)    
				return true;
			else             
				return false;
		}
		else if(year%100!=0){
			if(year%4==0)
				return true;
			else
				return false;
		}
		     else 
			return false;
	}

	public static void main(String[] args) {
		System.out.println("������һ���������:");
		Scanner sanner=new Scanner(System.in);
		int i=sanner.nextInt();
		System.out.println("�Ƿ�������:"+isLeap(i));
	}

}