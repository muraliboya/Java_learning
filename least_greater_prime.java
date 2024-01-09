// the problem statement
// Given an array of positive integers, replacing every element with the least greater prime number to its right
// if there is no greater prime number element to its right, replace it with -1.

import java.util.Arrays;

public class greaterprime {

	public static void main(String[] args) {
		int[] array1= {8,58,18,31,32,63,92,43,3,91,93,25,80,28};
		int[] array2=replacewithnextprime(array1);
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		
	

	}


  // this function is for replacing the array with least greater prime number
	public static int[] replacewithnextprime(int[] arr) {
		int[] result=new int[arr.length];
		Arrays.fill(result, -1);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[j] > arr[i] && findprime(arr[j])) { 
        // the number must be greater than the previous element and it must be prime number
        // if the condition satisfies, that prime number is added to array
				
				
			result[i]=arr[j];
			break;
				
			}
	       }
		}
		return result;
	}

  // this function is for checking whether the number is prime or not
	public static boolean findprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) return false;
		}
		return true;
	}
}
