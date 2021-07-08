
public class HeapSort {
	public void sort(int[] arr,int l,int i)
	{
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<l &&arr[left]>arr[largest])
			largest=left;
		if(right<l && arr[right]>arr[largest])
			largest=right;
		
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			sort(arr,l,largest);
		}
	}
	public void buildheap(int[] arr)
	{
		int l=arr.length;
		for(int i=(l-1)/2;i>=0;i--)
		{
			sort(arr,l,i);
		}
		for(int i=l-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			sort(arr,i,0);
		}
	}

	public static void main(String[] args) {
		HeapSort h=new HeapSort();
		int[] ar= {99,88,77,55,66,44,22,33,11,9,8,45,6,56,6,47};
		System.out.println();
		System.out.println("array Before sorting using method sort2()");
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		h.buildheap(ar);
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
