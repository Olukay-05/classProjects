package ticTacToe;

public class TicTacToe {

    enum Value {

        X(),        O(),        EMPTY();

    }
    private Value[][] board = new Value[3][3];
    public TicTacToe(){
        for(int i =0; i <3; i++)
            for(int j =0; j <3; j++)

                board[i][j]= Value.EMPTY;
    }


    public void player1sTurn(int i,int j){
        if(board[i][j]== Value.EMPTY)

            board[i][j]= Value.X;
        else

            System.out.println("Invalid move. Try again.");
    }

    public void player2sTurn(int i,int j){
        if(board[i][j]== Value.EMPTY)

            board[i][j]= Value.O;
        else

            System.out.println("Invalid move. Try again.");
    }

    public boolean gameState(){
        for(int i =0; i <3; i++){
            if(board[i][0]== board[i][1]&& board[i][1]== board[i][2]&& board[i][0]!= Value.EMPTY){
                if(board[i][0]== Value.X)

                    System.out.println("Player 1 wins.");
                if(board[i][0]== Value.O)

                    System.out.println("Player 2 wins.");
                return true;
            }

            if(board[0][i]== board[1][i]&& board[1][i]== board[2][i]&& board[i][0]!= Value.EMPTY)
            {

                if(board[0][i]== Value.X)

                    System.out.println("Player 1 wins.");
                if(board[0][i]== Value.O)

                    System.out.println("Player 2 wins.");
                return true;
            }
        }

        if(board[0][0]== board[1][1]&& board[1][1]== board[2][2]&& board[0][0]!= Value.EMPTY)
        {

            if(board[0][0]== Value.X)

                System.out.println("Player 1 wins.");
            if(board[0][0]== Value.O)

                System.out.println("Player 2 wins.");
            return true;
        }

        if(board[0][2]== board[1][1]&& board[1][1]== board[2][0]&& board[0][2]!= Value.EMPTY)
        {

            if(board[0][2]== Value.X)

                System.out.println("Player 1 wins.");


            if(board[0][2]== Value.O)

                System.out.println("Player 2 wins.");
            return true;
        }

        for(int i =0; i <3; i++)

            for(int j =0; j <3; j++)

                if(board[i][j]== Value.EMPTY)
                {

                    System.out.println("Next turn.");
                    return false;
                }

        System.out.println("It is a draw.");
        return true;
    }


    public void printBoard(){

        for(int i =0; i <3; i++){

            for(int j =0; j < 3; j++){

                System.out.printf("%5s   ", board[i][j]);
            }

            System.out.println();
        }
    }
}
