public class Light {
    public static void main(String[] args){
        int lightspeed;
        long days, seconds, distance;

        lightspeed = 186000;

        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("For " + days);
        System.out.print(" days light approximately makes distance ");
        System.out.println(distance + " miles.");

    }
}
