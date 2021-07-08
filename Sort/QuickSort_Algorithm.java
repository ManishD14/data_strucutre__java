
public class QuickSort_Algorithm {
	public int sort(int[] arr,int l,int h)
	{
		// sorting array //
		int low=l;
		int high=h;
		int pivot=(low+high)/2;
		int pivotval=arr[pivot];
		swap(arr,low,pivot);
		while(low<high)
		{
			while(arr[low]<=pivotval && low<high)
				low++;
			
			while(arr[high]>pivotval)
				high--;
			if(low<high)
				swap(arr,low,high);
		}
		swap(arr,l,high);
		return high;
	}
	public void quick(int[] arr,int down,int up)
	{
		//recursion function 
		int pivotloc;
		if(down<up)
		{
			pivotloc = sort(arr,down,up);
			quick(arr,down,pivotloc-1);
			quick(arr,pivotloc+1,up);
		}
	}
	public void swap(int[] a,int i,int j)
	{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	

	public static void main(String[] args) {
		
		QuickSort_Algorithm l=new QuickSort_Algorithm();
		int[] arr= {11,88,66,77,33,44,66,99,102};
		int n=arr.length-1;
		l.quick(arr, 0, n);
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
