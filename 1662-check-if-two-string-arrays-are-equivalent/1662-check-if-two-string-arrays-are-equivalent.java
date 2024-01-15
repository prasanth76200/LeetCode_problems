class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int arrIndex1=0,arrIndex2=0;
        int id1=0,id2=0;
        
        while(arrIndex1<word1.length&&arrIndex2<word2.length){
            if(word1[arrIndex1].charAt(id1)!=word2[arrIndex2].charAt(id2)){
                return false;
            }
            id1++;
            id2++;
            if(id1==word1[arrIndex1].length()){
                id1=0;
                arrIndex1++;
            }
             if(id2==word2[arrIndex2].length()){
                id2=0;
                arrIndex2++;
            }

        }     
        return arrIndex1==word1.length&&arrIndex2==word2.length;
        
        
        
    }
}