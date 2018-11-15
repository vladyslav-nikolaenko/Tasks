class IfSample {
    public static void main(String[] args){
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x less than y");

        x = x * 2;
        if (x == y) System.out.println("x equal to y");

        x = x * 2;
        if (x > y) System.out.println("x more than y");

        //This operator doesn't output anything
        if (x == y) System.out.println("You don't see it");
    }
}
