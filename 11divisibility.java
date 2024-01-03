// 11 divisibility rule

import java.io.*; 
import java.util.*; 

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner (System.in);
        String s1=sc.nextLine();
        System.out.println(gettingresult(s1));
    }
    public static int gettingresult(String s){
        int total=0;
        for(int i=0;i<s.length();i++){
            char digit=s.charAt(i);
            int n=Character.getNumericValue(digit);
            if(i%2==0){
                total=total+n;
            }else{
                total=total-n;
            }
           
        }
         int result=total%11;
         return result>=0?result:result+11;

    }
}
