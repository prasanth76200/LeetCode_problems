class Solution {
    public int compress(char[] chars) {
       
        int index = 0;
        int i=0;
        
        while(i<chars.length){
            
            char currentChar = chars[i];
            int count=0;
            
            while(i<chars.length && chars[i]==currentChar){
                i++;
                count++;
            }
            
            chars[index++] = currentChar;
            
            if(count>1){
                for(char a:Integer.toString(count).toCharArray()){
                    chars[index++] = a;
                }
            }
            
            
            
            
        }
        
        return index;
        
    }
}