public class Selection_Sort {
public void Method1(int[] arr)
{
	int n=arr.length;
	int smallest=0;
	for(int i=0;i<n-1;i++)
	{
		smallest=i;
		for(int j=i+1;j<n;j++)
		{
			if(arr[j]<arr[smallest])
			   smallest=j;
		}
		swap(arr,i,smallest);	
	}
}
public void method2(int[] arr)
{
	int n=arr.length;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
}

public void swap(int[] arr,int i,int j)
{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
	public static void main(String[] args) {
		int[] arr= {78,65,12,98,35,47,31,936,45,31,30,20,10};
		Selection_Sort s=new Selection_Sort();
		
		
		System.out.println("Printing base array");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		
		//method1()
		System.out.println("Sorting an array using method1()");
		s.Method1(arr);
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		/// initializing second array for method2()
		int[] ar= {14,9,8,36,17,198,65,4,56,7,93,64,98,64,87,66,1};
		
		System.out.println("Printing base array for method()");
		for(int i:ar)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Sorting an array using method2()");
		s.method2(ar);
		for(int i:ar)
			System.out.print(i+" ");
		

	}

}
