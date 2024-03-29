class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>rowSet=null;
        Set<Character>colSet=null;
        
        for(int i=0;i<9;i++){
            rowSet= new HashSet<>();
             colSet= new HashSet<>();
            for(int j=0;j<9;j++){
               char row=board[i][j];
                char col=board[j][i];
                if(row!='.'){
                    if(rowSet.contains(row)){
                        return false;
                    }
                    else{
                        rowSet.add(row);
                    }
                }
                if(col!='.'){
                    if(colSet.contains(col)){
                        return false;
                    }
                    else{
                        colSet.add(col);
                    }
                }
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                
                if(!checkBox(i,j,board)){
                    return false;
                }
                
            }
        }
        return true;
        
    }
    
    private boolean checkBox(int index1,int index2,char[][]board){
        Set<Character> box=new HashSet<>();
        
        int rowBox = index1 + 3;
        int colBox = index2 + 3;
        for(int i=index1;i<rowBox;i++){
            for(int j=index2;j<colBox;j++){
               if(board[i][j]=='.'){
                   continue;
               } 
                
                if(box.contains(board[i][j])){
                    return false;
                }
                
                   box.add(board[i][j]);
                
                
            }
        }
        
        return true;    
        
    }
}