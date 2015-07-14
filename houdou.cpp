#include <stdio.h>   
int fun(int n);                     //声明被调用函数
int main() 
{
	int i,n,f;
	printf("请输入一个整数:\n");
	scanf("%d",&n);
	if(n<0)  printf("error!");
    for(i=0;i<n+1;i++)
   {
	   f=fun(i);                         //调用函数         
       printf("%d\n",f);                //输出提示信息
   }
                 
  }

int fun(int n)                            //子函数的定义
{
	
if(n==0)  return 0;
else
if(n==1)  return 1;
else   
return fun(n-1)+fun(n-2);

}