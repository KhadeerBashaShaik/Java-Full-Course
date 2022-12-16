package utility;

public class Utility {
	public static void sort(int a[])
	{
		int l=a.length;
		int t,i,j;
		for(i=1;i<l;i++)
		{
			for(j=0;j<l-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("sorted array is=");
		for(i=0;i<l;i++)
			System.out.print(a[i]);
		
	}
	static int findSmallest(int a[])
	{
int l=a.length;
int i,s;
s=a[0];
for(i=1;i<l;i++)
{
	if(a[i]<s)
		s=a[i];
}
return(s);
	}
static int findLargest(int a[])
{
	int l=a.length;
	int i,max;
	max=a[0];
	for(i=1;i<l;i++)
	{
		if(a[i]>max)
			max=a[i];
	}
	return(max);
		}
	
}
