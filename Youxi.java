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
		String num;
		do{
			Scanner s=new Scanner(System.in);
			System.out.print("please input x value(0-100):");
			int x=s.nextInt();
			if(x<0||x>100) System.out.print("error!"+"\n");
			else{System.out.println("比较次数:"+guess(x));}
			System.out.println("continue? yes--Y no--N");
			Scanner in=new Scanner(System.in);
			num=in.next();
		}while(num.equals("Y"));
	}




}

