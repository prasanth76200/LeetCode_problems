
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndex(mountainArr);
        int result = binarySearchAscending(target, 0, peak, mountainArr);
        
        if (result != -1) {
            return result;
        }
        
        return binarySearchDescending(target, peak + 1, mountainArr.length() - 1, mountainArr);
    }
    
    private int peakIndex(MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    
    private int binarySearchAscending(int target, int start, int end, MountainArray mountainArr) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    private int binarySearchDescending(int target, int start, int end, MountainArray mountainArr) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) {
                return mid;
            } else if (midValue > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
