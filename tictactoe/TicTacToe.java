import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> computerPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '}};

        printBoard(gameBoard);

        while (true) {
            System.out.println("Enter a value (1-9): ");
            Scanner scanner = new Scanner(System.in);
            int playerPosition = scanner.nextInt();
            while (playerPositions.contains(playerPosition) || computerPositions.contains(playerPosition)) {
                System.out.print("Position taken \n");
                playerPosition = scanner.nextInt();
            }

            placePiece(gameBoard, playerPosition, "player");
            String result = checkWinner(gameBoard);
            if (!result.isEmpty()) {
                System.out.print(result);
            }

            /*
              TODO: implement minmax for computer
             */
            Random random = new Random();
            int computerPosition = random.nextInt(9) + 1;
            while (playerPositions.contains(computerPosition) || computerPositions.contains(computerPosition)) {
                computerPosition = scanner.nextInt();
            }
            placePiece(gameBoard, computerPosition, "computer");

            printBoard(gameBoard);
            result = checkWinner(gameBoard);
            if (!result.isEmpty()) {
                System.out.print(result);
                scanner.close();
            }
        }


    }

    public static void printBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char character : row) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int position, String user) {
        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(position);
        } else if (user.equals("computer")) {
            symbol = 'O';
            computerPositions.add(position);
        }


        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkWinner(char[][] gameBoard) {
        List<List> winning = getLists();

        for (List list : winning) {
            if (playerPositions.containsAll(list)) {
                printBoard(gameBoard);
                return "Congrats u win! \n";
            } else if (computerPositions.containsAll(list)) {
                printBoard(gameBoard);
                return "CPU wins.  \n";
            } else if (playerPositions.size() + computerPositions.size() == 9) {
                printBoard(gameBoard);
                return "CAT  \n";
            }
        }
        return " ";
    }

    private static List<List> getLists() {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> botRow = Arrays.asList(7, 8, 9);
        List<Integer> leftCol = Arrays.asList(1, 4, 7);
        List<Integer> midCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(3, 6, 9);
        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);
        return winning;
    }
}
