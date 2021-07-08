

public class MergeSort {

	public void merge(int[] arr,int low,int mid,int high)
	{
		int n1=mid-low+1;
		int n2=high-mid;
		int l[]=new int[n1];
		int r[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			l[i]=arr[low+i];
		}
		for(int i=0;i<n2;i++)
		{
			r[i]=arr[mid+1+i];
		}
		
		// comparing both arrays 
		//l array
		int i=0,j=0,k=low;
		while(i<n1 &&j<n2)
		{
			if(l[i]<=r[j])
			{
				arr[k]=l[i];
				i++;
			}
			else
			{
				arr[k]=r[j];
				j++;
			}
			k++;
		}
		//coppying remainig elements to aaray
		
			while(i<n1)
			{
				arr[k]=l[i];
				i++;
				k++;
			}
			while(j<n2)
			{
				arr[k]=r[j];
				j++;
				k++;
			}	
		
		
	}
	public void recursion(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			recursion(arr,low,mid);
			recursion(arr,mid+1,high);
			merge(arr,low,mid,high);
			
		}
	}
	public static void main(String[] args) {
		MergeSort m=new MergeSort();
		
		int[] ar= {99,88,77,55,66,44,22,33,11,9,8,45,6,56,6,47};
		System.out.println();
		System.out.println("array Before sorting using method sort2()");
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		int n=ar.length-1;
		System.out.println();
		m.recursion(ar,0,n);
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
