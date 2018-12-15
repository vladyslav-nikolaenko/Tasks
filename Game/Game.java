import Board.Board;
import Factories.BoardFactory;
import Factories.SmallBoardFactory;
import GameStrategy.GameStrategy;
import GameStrategy.With2ndPlayerGameStrategy;
import GameStrategy.MockGameStrategy;

public class Game {

    public static void main(String[] args) {

        BoardFactory boardFactory = new SmallBoardFactory();
        Board board = boardFactory.creat();

        GameStrategy gameStrategy = new MockGameStrategy();
        gameStrategy.setBoard(board);

        gameStrategy.play();
    }

}
