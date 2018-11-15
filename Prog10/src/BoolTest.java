//shows using values of boolean type
public class BoolTest {
    public static void main(String[] args){
        boolean b;

        b = false;
        System.out.println("b is equal to " + b);
        b = true;
        System.out.println("b is equal to " + b);

        if (b) System.out.println("This code is executed");
        b = false;
        if (b) System.out.println("This code isn't executed");

        System.out.println("10 > 9 is equal to" + (10 > 9));

    }
}
