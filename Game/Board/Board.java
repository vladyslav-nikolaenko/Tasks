package Board;

public interface Board extends Drawable {

    void drawCoordinateFormat();
    void setSymbol(char symbol, int coordinate);
    void consists(char symbol, int coordinates);

}
