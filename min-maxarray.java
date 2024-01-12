// finding min and max elements in the array
// hackerank week1
public static void miniMaxSum(List<Integer> arr) {
        // write your code here
    long sum=0;
    long min=Long.MAX_VALUE;
    long max=Long.MIN_VALUE;
    
    for(int i=0;i<arr.size();i++){
        sum=sum+arr.get(i);
        min=Math.min(min,arr.get(i));
        max=Math.max(max,arr.get(i));
            
         }
    long min1 = sum - max;
    long max1 = sum - min;
    System.out.println(min1+" "+max1);

    }

}

