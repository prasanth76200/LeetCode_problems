class Solution {
    public String restoreString(String s, int[] indices) {
        
       
        
        int i=0;
        while(i<indices.length){
            int correctIndex = indices[i];
            if(indices[i]!=correctIndex){
                swap(indices,i,correctIndex);
            }
            else{
                i++;
            }
        }
         StringBuffer sb = new StringBuffer();
        char c[] = new char[s.length()];
        for(int index=0; index<indices.length; index++){
            c[indices[index]]=s.charAt(index);
        }
         sb.append(c);
                 return sb.toString();
        
    }
    
    void swap(int[] indices,int first,int second){
        int temp = indices[first];
        indices[first]= indices[second];
        indices[second]=temp;
        
    }
}