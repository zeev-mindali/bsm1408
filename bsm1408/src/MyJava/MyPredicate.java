package MyJava;

import java.util.function.Predicate;

public class MyPredicate {
    static boolean isPhoneNumberValid (String phoneNumber){
        System.out.print(phoneNumber+": ");
        return phoneNumber.startsWith("05") && phoneNumber.length()==11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber-> phoneNumber.startsWith("05") && phoneNumber.length()==11;
    static Predicate<String> isPhoneHas3 = phoneNumber->phoneNumber.contains("3");
    static Predicate<String> isPhoneHaveDash = phoneNumber->phoneNumber.contains("-");
    public static void main(String[] args) {
        System.out.println("Without Predicate:");
        System.out.println(isPhoneNumberValid("052-4043142"));
        System.out.println(isPhoneNumberValid("052-54338745687"));
        System.out.println(isPhoneNumberValid("152-1345523"));

        System.out.println("With Predicate:");
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneHaveDash).and(isPhoneHas3).test("0524031142"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneHaveDash).and(isPhoneHas3).test("052-54338745687"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneHaveDash).and(isPhoneHas3).test("152-1245521"));

    }
}
