import java.util.ArrayList;
import java.util.Scanner;
class StringMatch1{
	private  String str;
	private char[] a;
	//构造方法
	public  StringMatch1(String str){
		this.str=str;
	} 
	//求字符x在str中出现的次数
	public  int numberOfOccurence(char x){
		a=str.toCharArray();   //将字符串拆分为字符到数组.
		int iCount=0;
		for(int i=0;i<=a.length-1;i++){
			if(a[i]==(x)){
				iCount++;
			} 
			else continue;
		}
		return iCount;
	}

	private static String isSame(String s) {
		char a = s.charAt(0);
		for(char c : s.toCharArray()){
			if (a != c)
				return null;
		}
		return s;
	}

	//求str中出现次数最多且长度为len的最小子字符串
	public String getMaxSubStr(int len){
		a=str.toCharArray();
		String min =null;
		ArrayList<String>arr=new ArrayList<String>();
		ArrayList<Integer> ch1=new ArrayList<Integer>();
		String ch2=null;
		for(int i=0;i<=a.length-1;i++){
			String s="";
			for(int j=i;j<i+len;j++){
				if(i+len<=a.length)
					s+=a[j];
			}
			if(s.equals("")){
				continue;
			}
			if(isSame(s)!=null){
				arr.add(s);
			}
		}
		for(int i=0;i<arr.size();i++){
			int num=0;
			for(String s:arr){
				if(arr.get(i).equals(s)){
					num++;
				}	
			}
			ch1.add(num);
		}
		Integer max=0;
		ch2=arr.get(0);
		for(int i=0;i<ch1.size();i++){
			if(max<ch1.get(i)){
				max=ch1.get(i);
				ch2=arr.get(i);
			}else if(max==ch1.get(i)){
				if(ch2.charAt(0)>arr.get(i).charAt(0))
					ch2=arr.get(i);

			}
		}
		return ch2;
	}
}
public class StringMatch{
	public  static void main(String[] args)
	{  
		String c;
		String z;
		int n;

		Scanner in= new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		c=in.next();
		StringMatch1 m=new StringMatch1(c);
		System.out.println("请输入一个字符:");
		z=in.next();
		char x=z.charAt(0);  //把字符串的第0位转化为字符。
		System.out.println("请输入需要的长度:");
		n=in.nextInt();
		System.out.println(m.numberOfOccurence(x));
		System.out.println(m.getMaxSubStr(n));
	}
}