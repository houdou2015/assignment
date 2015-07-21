import java.util.*;
public class  Youxi{
	public static int  guess(int x){
        int i,l=0,r=100,mid;
		for(i=1;i<=100;i++){
			mid=(l+r)/2;
			if(x==mid) { break;}
			else
			if(x<mid)    
				{r=mid-1; }
			else
				{l=mid+1; }
		}
		return i;
	}
	public static void main(String[] args) {
		Scanner san=new Scanner(System.in);
		System.out.println("请输入一个0~100之内的整数:");
		int x=san.nextInt();
		System.out.println(guess(x));
		}
