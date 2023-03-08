import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        boolean gameOn = true;

        String[][] board = {
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"_", "_", "_"}
        };
        

        String turn = "X";
        int counter = 0;
        int winner = 0;

        Scanner scan = new Scanner(System.in);

        while(gameOn) {
            if (turn.equals("X")) {
                System.out.println("\n\nTurn: X");
                
                System.out.print("\tPick a row and column number: ");
                int r = scan.nextInt();
                int c = scan.nextInt();
                
                while (r > 3 || r < 1 || c > 3 || c < 1) {
                    System.out.print("\tRow and column numbers must be 1-3\n\tPick a row and column number: ");
                    r = scan.nextInt();
                    c = scan.nextInt();
                }
                
                while ((board[r-1][c-1].equals("O")) || (board[r-1][c-1].equals("X"))) {
                    
                    System.out.println("Cannot go there, spot is already taken.");
                    System.out.print("\tPick a row and column number: ");
                    r = scan.nextInt();
                    c = scan.nextInt();
                }
                board[r-1][c-1] = "X";
                printBoard(board);

                turn = "O";
                counter++;

                if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && board[0][1].equals("X")) ||(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && board[1][1].equals("X"))) {
                    System.out.println("\nPlayer X wins!");
                    winner = 1;
                    gameOn = false;
                } else if ((board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && board[2][1].equals("X")) ||(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && board[2][0].equals("X"))) {
                    System.out.println("\nPlayer X wins!");
                    winner = 1;
                    gameOn = false;
                } else if ((board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && board[2][1].equals("X")) ||(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && board[2][2].equals("X"))) {
                    System.out.println("\nPlayer X wins!");
                    winner = 1;
                    gameOn = false;
                } else if ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[2][2].equals("X")) ||(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && board[2][0].equals("X"))) {
                    System.out.println("\nPlayer X wins!");
                    winner = 1;
                    gameOn = false;
                } else if (counter == 9 && winner == 0) {
                    System.out.println("\nIt's a tie.");
                    gameOn = false;
                }
                else {
                    continue;
                }
            } else {
                System.out.println("\n\nTurn: O");
                System.out.print("\tPick a row and column number: ");
                int r = scan.nextInt();
                int c = scan.nextInt();

                while (r > 3 || r < 1 || c > 3 || c < 1) {
                    System.out.print("\tRow and column numbers must be 1-3\n\tPick a row and column number: ");
                    r = scan.nextInt();
                    c = scan.nextInt();
                }
                
                while ((board[r-1][c-1].equals("O")) || (board[r-1][c-1].equals("X"))) {
                    
                    System.out.println("Cannot go there, spot is already taken.");
                    System.out.print("\tPick a row and column number: ");
                    r = scan.nextInt();
                    c = scan.nextInt();
                    }
                    board[r-1][c-1] = "O";
                printBoard(board);
                turn = "X";
                counter++;
                if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && board[0][1].equals("O")) ||(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && board[1][1].equals("O"))) {
                    System.out.println("\nPlayer O wins!");
                    winner = 1;
                    gameOn = false;
                } else if ((board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && board[2][1].equals("O")) ||(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && board[2][0].equals("O"))) {
                    System.out.println("\nPlayer O wins!");
                    winner = 1;
                    gameOn = false;
                } else if ((board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && board[2][1].equals("O")) ||(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && board[2][2].equals("O"))) {
                    System.out.println("\nPlayer O wins!");
                    winner = 1;
                    gameOn = false;
                } else if ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[2][2].equals("O")) ||(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && board[2][0].equals("O"))) {
                    System.out.println("\nPlayer O wins!");
                    winner = 1;
                    gameOn = false;
                } else if (counter == 9 && winner == 0) {
                    System.out.println("\nIt's a tie.");
                    gameOn = false;
                }
                else {
                    continue;
                }
            }
        }

        scan.close();
    }
    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
    }
}
