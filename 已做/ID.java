import java.util.*;
public class ID {
	public static boolean id_text(String id) {
		int sum=0;
		int[] a={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		int array[]=new int[17];
		try{
			for(int i=0;i<17;i++){
				array[i]=Integer.parseInt(String.valueOf(id.charAt(i)));     //把从键盘输入的数强制转换成字符串，在转换成整型     
				sum+=a[i]*array[i];
			}
			
		}catch(Exception h){
			System.out.println("异常");
		}
		int figure=sum%11;
		try{
			int n=Integer.parseInt(String.valueOf(id.charAt(17)));          //把从键盘输入的数强制转换成字符串，在转换成整型     
			if(figure<=1){
				return (figure==0 && n==1)||(figure==1 && n==0);
			}else if((figure==(12-n))||(figure<=10)){
				return true;
			}else
				return false;
		}catch(Exception e){
			if((figure==2)||(String.valueOf(id.charAt(17)).equals("X")))
				return true;
			else
				return false;
		}
	}
	public static void main(String[] args){
		Scanner san=new Scanner(System.in);
		System.out.println("请输入您的身份证号码:");
		String id=san.next();
		if(id_text(id))
			System.out.println("身份证合法");
		else
			System.out.println("身份证不合法");
	}
}