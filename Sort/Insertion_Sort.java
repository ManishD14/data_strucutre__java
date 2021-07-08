public class Insertion_Sort {

	public void method1(int[] arr)
	{
		int i,j,temp=0;
		int n=arr.length;
		for(i=0;i<n;i++)
		{
			temp=arr[i];
			for(j=i;(j>0)&&(temp<arr[j-1]);j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
	}
	public void method2(int[] arr)
	{
		int i,j;
		int n=arr.length;
		for( i=0;i<n;i++)
		{
			int temp=arr[i];
			for(j=i-1;(j>=0)&&(arr[j]>temp);j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int[] arr= {78,65,12,98,35,47,31,936,45,31,30,20,10};
		Insertion_Sort s=new Insertion_Sort();
		
		
		System.out.println("Printing base array");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		
		//method1()
		System.out.println("Sorting an array using method1()");
		s.method1(arr);
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
