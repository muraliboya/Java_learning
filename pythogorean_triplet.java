import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int k=0;
        for(int i=0;i<size-2;i++){
            if((Math.pow(arr[i],2)+Math.pow(arr[i+1],2)) == Math.pow(arr[i+2],2))   k=1;
        }
        if(k==1)   System.out.println("Yes");
        else   System.out.println("No");
        

    }
}
