class Solution {
    public String tictactoe(int[][] moves) {
        String[][] game= new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                game[i][j]=".";
            }
        }
        for(int i=0;i<moves.length;i++){
            if(i%2==0){
                game[moves[i][0]][moves[i][1]]="X";
            }else{
                game[moves[i][0]][moves[i][1]]="0";
            }
        }
        return check(game);
    }
    public String check(String[][] game){
        int n=game.length;
        for(int j=0;j<n;j++){
            int countA=0;
            int countB=0;
            for(int i=0;i<n;i++){
                if(game[i][j]=="X") countA++;
                else if(game[i][j]=="0") countB++;
            }
            if(countA==3) return "A";
            if(countB==3) return "B";
        }
        
        
        for(int j=0;j<n;j++){
            int countA=0;
            int countB=0;
            for(int i=0;i<n;i++){
                if(game[j][i]=="X") countA++;
                else if(game[j][i]=="0") countB++;
            }
             if(countA==3) return "A";
            if(countB==3) return "B";
        }
       
        
       if(game[0][0]=="X" && game[1][1]=="X" && game[2][2]=="X") return "A"; 
       if(game[0][0]=="0" && game[1][1]=="0" && game[2][2]=="0") return "B"; 
        if(game[2][0]=="X" && game[1][1]=="X" && game[0][2]=="X") return "A"; 
       if(game[2][0]=="0" && game[1][1]=="0" && game[0][2]=="0") return "B"; 
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(game[i][j]=="X" || game[i][j]=="0") count++;
            }
        }
        if(count==9) return "Draw";
        return "Pending";
        
    }
}