#include <stdio.h>   
int fun(int n);                     //���������ú���
int main() 
{
	int i,n,f;
	printf("������һ������:\n");
	scanf("%d",&n);
	if(n<0)  printf("error!");
    for(i=0;i<n+1;i++)
   {
	   f=fun(i);                         //���ú���         
       printf("%d\n",f);                //�����ʾ��Ϣ
   }
                 
  }

int fun(int n)                            //�Ӻ����Ķ���
{
	
if(n==0)  return 0;
else
if(n==1)  return 1;
else   
return fun(n-1)+fun(n-2);

}