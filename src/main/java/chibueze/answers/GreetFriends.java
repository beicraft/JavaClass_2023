package chibueze.answers;

import java.text.MessageFormat;

public class GreetFriends {

    // create a method to greet a friend
    public static void greetFriend(String name){
        // create logic
        String message = MessageFormat.format("Hello {0}!", name);
        System.out.println(message);
    }

}
