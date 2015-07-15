import java.util.*;
public class Average{                
	public static double averageScore(ArrayList<Integer> scores){
		double sum=0;
		int i=0;
		while(i<scores.size()){
			sum=sum+scores.get(i);
			i+=1;
		}
		return sum/(scores.size()-1);
		/*for(;i<scores.size();i++){
			sum+=scores.get(i);
		}
		return sum/(scores.size()-1);
        for(Integer x:scores){              scores是元素类型为Integer的数组         score不为空时执行循环体
			sum+=x;
		}
		return sum/(scores.size()-1);
        do{sum=sum+scores.get(i);
		i++;
		}while(i<scores.size());
		return sum/(scores.size()-1);*/
	}
	public static void main(String[] args){
		Scanner san=new Scanner(System.in);
		double n=0;
		int i=0;
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> scores=new ArrayList<Integer>();
		System.out.print("要输出平均值请输入-->");
		System.out.print("请输入成绩:");
		do{
			int mm=san.nextInt();
			i=mm;
			scores.add(mm);
		}while( i!=0);
		n=averageScore(scores);
		System.out.println(n);       
	}
}