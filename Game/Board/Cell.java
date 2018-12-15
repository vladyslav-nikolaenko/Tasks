package Board;

public class Cell implements  Drawable{

    private String separator;
    private String value;

    public Cell(String value, String separator){

        this.separator = separator;
        this.value = value;

    }

    @Override
    public void draw() {

    }
}
