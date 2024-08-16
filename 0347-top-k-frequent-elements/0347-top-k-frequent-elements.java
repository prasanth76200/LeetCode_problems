class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int a: nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        map.entrySet()
            .stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .limit(k)
            .forEach(entry-> list.add(entry.getKey()));
        
        
        return list.stream().mapToInt(i->i).toArray();
        
    }
}