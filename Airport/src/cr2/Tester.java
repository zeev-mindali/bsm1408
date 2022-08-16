package cr2;


import java.lang.reflect.Field;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User("zeev","12345");
        Class userHacked = user.getClass();

        Field[] hackedFields = userHacked.getDeclaredFields();
        //Arrays.stream(hackedFields).forEach(System.out::println);
        if (!hackedFields[0].isAccessible()) {hackedFields[0].setAccessible(true);}
        hackedFields[1].setAccessible(true);
        System.out.println(hackedFields[0].getType()+" "+hackedFields[0].getName());
        System.out.println(hackedFields[1].getType()+" "+hackedFields[1].getName());
        System.out.println("userName: "+hackedFields[0].get(user));
        System.out.println("userPass: "+hackedFields[1].get(user));
        //System.out.println("userName: "+user.getUserName()+"\nuserPass: "+ user.getUserPass());

    }
}
