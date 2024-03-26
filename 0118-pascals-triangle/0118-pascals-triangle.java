class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
	
        List<Integer> firstrow=new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        
        for(int i=1;i<numRows;i++){
            
            List<Integer> prevRow = result.get(i-1);
            
            ArrayList<Integer> secondrow = new ArrayList<>();
            secondrow.add(1);
            for(int j=0;j<i-1;j++){
                secondrow.add(prevRow.get(j) + prevRow.get(j+1));
            }
            secondrow.add(1);
            
            result.add(secondrow);
            
        }
        
        return result;
	  
    }
}