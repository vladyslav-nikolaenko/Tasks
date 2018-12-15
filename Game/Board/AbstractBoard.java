package Board;

import java.util.List;

public abstract class AbstractBoard implements Board{

    protected  List<Cell> cells;
    protected List coordinateFormatCells;

    public abstract void initializeBoard();

    public  AbstractBoard(){

        initializeBoard();
    }

}
