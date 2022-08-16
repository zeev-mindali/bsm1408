package cr7;

public class Avial {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //let do some generic class, becuase avial don't love casting

        String miMisparAched = "Aviel";
        Class<? extends String> newString = miMisparAched.getClass();
        String st = newString.newInstance();
    }
}
