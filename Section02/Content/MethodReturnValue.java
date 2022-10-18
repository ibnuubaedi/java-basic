package Section02.Content;

public class MethodReturnValue {

    public static void main(String[] args) {

        String greeting = "Hello";
        int numberOfCharacter = greeting.length();
        System.out.println(numberOfCharacter);

        greeting = greeting.replace("e", "3");
        System.out.println(greeting);

        String river = "Mississipi";
        river = river.replace("issipi", "Our");

        System.out.println(river);

    }

}
