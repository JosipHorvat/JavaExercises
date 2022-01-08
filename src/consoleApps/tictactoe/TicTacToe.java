package consoleApps.tictactoe;

import java.util.Scanner;

public class TicTacToe {

        private final char[] position = new char[10];
        private char player;
       private static Scanner in =new Scanner(System.in);


        public static void main(String args[])
        {
            String playAgain;
            TicTacToe Toe=new TicTacToe();
           do{
                Toe.newBoard();
                Toe.play();
                System.out.println ("Would you like to play again (Enter 'yes')? ");
                 playAgain=in.nextLine();
           }while (playAgain.equals("yes"));

        }
        public  void newBoard()
        {
            char[] posndef = new char[10];
            player = 'X';
            for (int i=1; i<=9; i++) position[i]=posndef[i];
            currentBoard();
        }

        public  void currentBoard() {
            System.out.println(  "\t    |    |   " );
            System.out.println(  "\t" +  position[1] + "   | " + position[2]+ "  | " + position[3]);
            System.out.println(  "\t ___|____|___ " );
            System.out.println(  "\t    |    |   " );
            System.out.println(  "\t" + position[4]+ "   | " + position[5]+ "  | " + position[6]);
            System.out.println(  "\t ___|____|___ " );
            System.out.println(  "\t    |    |   " );
            System.out.println(  "\t" + position[7]+ "   | " + position[8]+ "  | " + position[9]);
            System.out.println(  "\t    |    |   " );
            System.out.println();
        }

        public  void play() {
            int spot;
            char blank = ' ';

            System.out.println(  "Player " + player +" will go first and be the letter 'X'" );

            do {
                currentBoard();              // display current board

                System.out.println(  "\n Player " + player +" choose a position 1-9." );

                boolean posTaken = true;
                while (posTaken) {
                    Scanner in =new Scanner (System.in);
                    spot=in.nextInt();
                    posTaken = isPositionTaken(spot);
                    if(posTaken==false)
                        position[spot]=player;
                }

                currentBoard();              // display current board
                nextPlayer();
            }while ( checkWinner() == blank );
        }

        public  char checkWinner() {
            char winner = ' ';
            // check for Tie
            for(int i=1;i<10;i++) {
                if(position[i]=='X' || position[i]=='O')
                {
                    if(i==9) {
                        char Draw='D';
                        System.out.println(" Game is tie ");
                        return Draw;
                    }
                }
                else
                    break;
            }

            // Check if X wins
            if (position[1] == 'X' && position[2] == 'X' && position[3] == 'X') winner = 'X';
            if (position[4] == 'X' && position[5] == 'X' && position[6] == 'X') winner = 'X';
            if (position[7] == 'X' && position[8] == 'X' && position[9] == 'X') winner = 'X';
            if (position[1] == 'X' && position[4] == 'X' && position[7] == 'X') winner = 'X';
            if (position[2] == 'X' && position[5] == 'X' && position[8] == 'X') winner = 'X';
            if (position[3] == 'X' && position[6] == 'X' && position[9] == 'X') winner = 'X';
            if (position[1] == 'X' && position[5] == 'X' && position[9] == 'X') winner = 'X';
            if (position[3] == 'X' && position[5] == 'X' && position[7] == 'X') winner = 'X';
            if (winner == 'X' )
            {System.out.println("Player1 wins the game." );
                return winner;
            }

            // Check if O wins
            if (position[1] == 'O' && position[2] == 'O' && position[3] == 'O') winner = 'O';
            if (position[4] == 'O' && position[5] == 'O' && position[6] == 'O') winner = 'O';
            if (position[7] == 'O' && position[8] == 'O' && position[9] == 'O') winner = 'O';
            if (position[1] == 'O' && position[4] == 'O' && position[7] == 'O') winner = 'O';
            if (position[2] == 'O' && position[5] == 'O' && position[8] == 'O') winner = 'O';
            if (position[3] == 'O' && position[6] == 'O' && position[9] == 'O') winner = 'O';
            if (position[1] == 'O' && position[5] == 'O' && position[9] == 'O') winner = 'O';
            if (position[3] == 'O' && position[5] == 'O' && position[7] == 'O') winner = 'O';
            if (winner == 'O' ) {
                System.out.println( "Player2 wins the game." );
                return winner; }

            return winner;
        }

        public  boolean isPositionTaken(int spot) {
            if (position[spot] == 'X' || position[spot] == 'O') {
                System.out.println("That position is already taken, please choose another");
                return true;
            }
          return false;
        }

        public  void nextPlayer() {
            if (player == 'X')
                player = 'O';
            else player = 'X';
        }
    }

