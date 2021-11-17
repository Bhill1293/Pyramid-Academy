import com.company.gameBoard;


public class Person {
    int health = 100;
    private String [][] placesMoved;

    static int getInt(char input){
        return switch (input) {
            case 'N', 'E' -> +1;
            case 'S', 'W' -> -1;
            default -> 0;
        };
    }
    gameBoard [][] playerBoard = new gameBoard[][];

    public gameBoard[][] Move(String direction, int steps) {
        //N = [+1][0]
        //S = [-1][0]
        //W = [0][-1]
        //E = [0][1]
        //random steps... So N1 or N10
        char humanSymbol = 'P';
        int x = getInt(direction.charAt(0));
        int y = Integer.parseInt(direction.split("")[1]);
        int i;
        for (i = 0; i <= x; i++) {
            for (int j = 0; j <= playerBoard[i]; j++) {
                if (direction.charAt(0) == 'N') {
                    playerBoard[i + x][y];
                }
            if (direction.charAt(0) == 'E') {
                playerBoard[i][y + x];
            }
            if (direction.charAt(0) == 'S') {
                playerBoard[i + x][y];
            }
            if (direction.charAt(0) == 'W') {
                playerBoard[i][y + x];
            }
            playerBoard[i][y] = "H ";
        }
    }
        return playerBoard;
    }
}

