
public class ShellSort {
	public void sort1(int[] arr)
	{
		int i,j,k,h=0,x=0,hcnt,temp;
		int[] shells=new int[20];// change size on basis of input array
		k=1;
		int n=arr.length;
		//divide array in form of 2*k+1
		for(i=0;k<n;i++)
		{
			shells[i]=k;
			k=(k*2)+1;
		}
		
		for(--i;i>=0;i--)
		{
			h=shells[i];
			for(hcnt=h;hcnt<2*h;hcnt++)
			{
				for(j=hcnt;j<n;j+=h)
				{
					temp=arr[j];
					x=j;
					while((x-h)>=0 && (temp<arr[x-h]))
					{
						arr[x]=arr[x-h];
						x=x-h;
					}
					arr[x]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		ShellSort m=new ShellSort();
		int[] arr= {11,88,66,77,33,44,66,99,102,6,78,45};
		System.out.println("array Before sorting using method sort1()");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		m.sort1(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int[] ar= {99,88,77,55,66,44,22,33,11,9,8,45,6,56,6,47};
		System.out.println();
		System.out.println("array Before sorting using method sort2()");
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		m.sort2(ar);
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}
	public void sort2(int[] arr)
	{
		int i,j,k,h,hcnt,temp,x;
		int[] shell=new int[20];
		k=1;
		for(i=0;i<arr.length;i++)
		{
			shell[i]=k;
			k=k*2+1;
		}
		for(--i;i>=0;i--)
		{
			h=shell[i];
			for(hcnt=h;hcnt<2*h;hcnt++)
			{
				for(j=hcnt;j<arr.length;j+=h)
				{
					temp=arr[j];
					x=j;
					while(x-h>=0 &&temp<arr[x-h])
					{
						arr[x]=arr[x-h];
						x=x-h;
					}
					arr[x]=temp;
				}
			}
		}
	}
	

}
