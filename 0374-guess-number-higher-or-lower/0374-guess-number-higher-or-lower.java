/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        if(guess(n)==0)return n;
        if(guess(n)==1)return 1;
        
        int start=0; int end=n-1;   
        
        while(true){
            int mid = start+(end-start)/2;
            
          if(guess(mid)==-1){
              end=mid-1;
          }
            else if(guess(mid)==1){
                start=mid+1;
            }
            else{
                return mid;
            }
        }

        
    }
}




// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//         if (guess(n) == 0) return n;
//         if (guess(1) == 0) return 1;
//         int low = 2, high = n-1;
//         while(true){
//             int mid = low + (high-low)/2;
//             if(guess(mid)==0){
//                 return mid;
//             }
//             else if(guess(mid)==-1){
//                 high = mid - 1;

//             }else if(guess(mid)==1){
//                 low = mid + 1;
//             }
//         }
//     }
// }
