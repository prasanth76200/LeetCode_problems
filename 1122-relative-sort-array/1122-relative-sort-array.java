class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i:arr2)
            hmap.put(i,0);
        int arr[] = new int[arr1.length];
        int last=arr1.length-1;
        for(int i:arr1)
        {
            if(hmap.containsKey(i))
                hmap.put(i,hmap.getOrDefault(i,0)+1);
            else
                arr[last--]=i;
        }
        int pos=0;
        for(int i:arr2)
            for(int j=0;j<hmap.get(i);j++)
                arr[pos++]=i;
        Arrays.sort(arr,pos,arr.length);
        return arr;
    }
}