public class LifeTime {
    public static void  main(String[] args){
        for(int x = 0, z = 0; x < 3; x++){
            int y = -1;

            System.out.println("y is equal to " + y);

            y = 100;
            System.out.println("now, y is equal to " + y);
        }
        //System.out.println("now, z is equal to " + z); //Error!
    }
}
