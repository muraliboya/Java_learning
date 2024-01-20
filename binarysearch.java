public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,6,8,66,77,88,99,100,234};
		int target=99;
		int index=implementationofbinarysearch(arr,target);
		if(index==-1) System.out.println("the element is not found");
		else System.out.println("the element is found at "+(index+1)+" position");

	}
	public static int implementationofbinarysearch(int[] arr1, int target1) {
		int left=0,right=arr1.length-1;
		while(left<=right) {
			int mid=(left+right)/2;

			if(target1==arr1[mid]) return mid;
			if(target1>arr1[mid]) left=mid+1;
			if(target1<arr1[mid]) right=mid-1;
			
		}
		return -1;
		
	}

}
