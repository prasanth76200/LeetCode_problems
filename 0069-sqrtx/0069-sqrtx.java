import java.util.*;
// class Solution {
//     public int mySqrt(int x) {
//       if(x==0||x==1)return x;
       
//        int start=1;
//         int end=x;
//         int ans=0;
        
//         while(start<end){
//             int mid=start+(end-start)/2;
//             int sqrt = mid*mid; 
//             if(sqrt==x){
//             return mid;
//             }
//             else if(sqrt<x) {
//                 ans=mid;  
//                start=mid+1;
//             }
//                 else{
//                      end=mid-1;
                
//             }
            

//         }
//        return ans; 
//     }
        
    
// }



class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x==1)return x ;
        long start = 1 ; 
        long end = x ; 
        long ans = 0 ; 
        while(start<=end){
            long mid = start+(end-start)/2 ; 
            long sqr = mid*mid ; 
            if(sqr==x) return (int) mid ;
            else if(sqr<x){
                ans = mid ;
                start = mid+1 ; 
            }
            else end = mid - 1; 
        }
        return (int) ans ;
    }
}
