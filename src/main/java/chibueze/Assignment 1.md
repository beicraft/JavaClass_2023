# Greet Friends!
Create The greetFriend method which will take a string of a name, and should return a string greeting 

```java
public class GreetFriends {
    public static void main(String[] args) {
        System.out.println(greetFriend("Douglas"));
        // Output: Hello Douglas!

        System.out.println(greetFriend("Maddie"));
        // Output: Hello Maddie!

        System.out.println(greetFriend("Poonam"));
        // Output: Hello Poonam!
    }

}
```

# Add Two Numbers
Write a method that takes two numbers and returns the sum of those numbers.
```java
public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println(add(2, 2));
        // Output: 4
    }
}
```

# Odd or Even?

Write a method that takes a single integer and returns a string of "odd" if it is an odd number, 
or "even" if it is even.

```java
public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(1));
        // Output: odd

        System.out.println(oddOrEven(2));
        // Output: even
    }
}
```

# Find the First Odd Number

Complete the method findFirstOdd, so that it takes an array of numbers and returns the first odd number.

```java
import java.util.Arrays;

public class FindFirstOdd {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5};
        System.out.println(findFirstOdd(arr1));
        // Output: 1

        int[] arr2 = {2, 4, 5};
        System.out.println(findFirstOdd(arr2));
        // Output: 5

        int[] arr3 = {2, 4, 6};
        System.out.println(findFirstOdd(arr3));
        // Output: 0 (assuming undefined means 0 in this case)
    }
}
```

# Retrieve Password

Write a method that takes a user object, which represents a user of the Beicraft website, 
and returns the value of the password key from that object.

If the user object does not contain a password key, the method should instead return undefined.

```java
import java.util.Map;

public class RetrievePassword {
    public static void main(String[] args) {
        Map<String, String> user1 = Map.of("name", "Lucy", "password", "n0rthc0derzzz");
        System.out.println(retrievePassword(user1));
        // Output: n0rthc0derzzz

        Map<String, String> user2 = Map.of("name", "Sam", "password", "hi!");
        System.out.println(retrievePassword(user2));
        // Output: hi!

        Map<String, String> user3 = Map.of("name", "Halima", "favouriteFood", "pizza");
        System.out.println(retrievePassword(user3));
        // Output: null (assuming undefined means null in this case)
    }

}
```

# Retrieve Key

Write a method that takes an object, and a string of the name of a key on that object. 
It should return the value of that key.

If the key doesn't exist on the object, it should return undefined


```java
import java.util.Map;

public class RetrieveKey {
    public static void main(String[] args) {
        Map<String, String> obj1 = Map.of("name", "Sam");
        System.out.println(retrieveKey(obj1, "name"));
        // Output: Sam

        Map<String, String> obj2 = Map.of("password", "Chips!");
        System.out.println(retrieveKey(obj2, "password"));
        // Output: Chips!

        Map<String, String> obj3 = Map.of("name", "Sam");
        System.out.println(retrieveKey(obj3, "age"));
        // Output: null (assuming undefined means null in this case)
    }

}
```

# Find Even Length Strings

This method will take an array of values, and should return an array of all the even length strings.

Anything that's not a string, or not a string of even length, should not be returned in the array.

If there are no even length strings, it should return an empty array.


```java
import java.util.ArrayList;
import java.util.List;

public class EvenLengthStringFinder {

    public static void main(String[] args) {
        // Example usage
        Object[] example1 = {"hi", "bye"};
        System.out.println(findEvenLengthStrings(example1)); // Output: [hi]

        Object[] example2 = {"bye"};
        System.out.println(findEvenLengthStrings(example2)); // Output: []

        Object[] example3 = {"keepOnlyMe", "notMe", 4};
        System.out.println(findEvenLengthStrings(example3)); // Output: [keepOnlyMe]
    }
}
```

# Is This a Palindrome?

Write a method that takes a string, and returns true if it is a palindrome, and false if it is not.

(A palindrome is a word that, when reversed, is exactly the same. e.g. "madam" or "racecar")


```java
public class PalindromeChecker {
    
    public static void main(String[] args) {
        // Example usage
        System.out.println(isThisAPalindrome("yay")); // Output: true
        System.out.println(isThisAPalindrome("no"));  // Output: false
    }
}
```

# Find Biggest and Smallest
Write a method that takes an array of numbers and returns the biggest and smallest in an object.


```java
import java.util.Arrays;

public class BiggestAndSmallestFinder {
    
    public static void main(String[] args) {
        // Example usage
        int[] numbers = {1, 2, 99, 100};
        Result result = findBiggestAndSmallest(numbers);
        System.out.println("Biggest: " + result.getBiggest());
        System.out.println("Smallest: " + result.getSmallest());
    }
}
```

# Is This Prime?

Write a function that takes a single positive integer as its argument. If the number is prime, it should return true. 
Otherwise, it should return false.

(A prime number is a number that is divisible only by itself and 1 - for example 2, 3, 5, 7, 11. 
The number 1 is not a prime.)


```java
public class PrimeChecker {
    

    public static void main(String[] args) {
        // Example usage
        System.out.println(checkIsPrime(2)); // Output: true
        System.out.println(checkIsPrime(4)); // Output: false
    }
}
```