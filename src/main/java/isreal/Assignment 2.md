# Hello, Beicraft Party Planner!

Beicraft want to have a party, and have enlisted the use of your savvy coding skills to help them!

Uh oh - you're ready to send out your invitations when you spot some typos...

Some of the names from your database don't have capital letters, so you need to make sure you capitalise the first letter of all of the guests names.

Your greetGuest method will take a string of a first name and should return a string of a greeting with the capitalised name, as shown in the example below.


```java
public class GreetingGenerator {

    public static void main(String[] args) {
        // Example usage
        System.out.println(greetGuest("Douglas")); // Output: Hello Douglas!
        System.out.println(greetGuest("maddie"));   // Output: Hello Maddie!
        System.out.println(greetGuest("poonam"));   // Output: Hello Poonam!
    }
}
```

# Find the Useful Emails

The Beicraft party invitations have been sent and responses are coming in! In the interest of inclusivity, Beicraft has opted to make this a pay-what-you-want event.

The finance team need to keep track of how much people are willing to pay for a ticket. You have been asked to write a function which will tell the team if an email contains information about a ticket price or not.

The findTicketPrices function will take a string, and should return a value of true if the string contains a number, and false if it does not.


```java
public class TicketPriceChecker {

    public static void main(String[] args) {
        // Example usage
        System.out.println(findTicketPrices("Hello, I think I can pay 11 pounds, is that alright?")); // Output: true
        System.out.println(findTicketPrices("I would be willing to pay 30 for a ticket"));           // Output: true
        System.out.println(findTicketPrices("Thanks for making this event pay what you can afford!")); // Output: false
    }
}
```

# Making the Guest List

We need to keep track of the party guests, but the data we currently have combines the guests first and last names into a single name. You have been asked to separate the names to make the data easier to work with.

The makeGuestList function takes an object with a name property whose value will be a string consisting of a first name and a last name, separated by a space. The function should return an object.

The function should remove the name property, replace it with firstName and lastName properties, as shown in the examples below.

```java
import java.util.HashMap;
import java.util.Map;

public class GuestListCreator {
    
    public static void main(String[] args) {
        // Example usage
        Map<String, Object> person1 = new HashMap<>();
        person1.put("name", "Hannah Fry");
        person1.put("age", 46);
        System.out.println(makeGuestList(person1)); // Output: {firstName=Hannah, lastName=Fry, age=46}

        Map<String, Object> person2 = new HashMap<>();
        person2.put("name", "Paul Erdős");
        person2.put("age", 46);
        System.out.println(makeGuestList(person2)); // Output: {firstName=Paul, lastName=Erdős, age=46}
    }
}
```
# Tracking the Ticket Prices

You have been asked to update the guest list with the amounts that each guest is willing to pay for a ticket. Unfortunately, all of the ticket prices found in email messages have been sent to you as strings!

The function trackAttendees takes an attendee object and a string representing how much they are willing to pay.

It should return a modified attendee object, with an added property key of paidForTicket and value of the amount the attendee is willing to pay.


```java
import java.util.Map;
import java.util.HashMap;

public class AttendeeTracker {

    public static void main(String[] args) {
        // Example usage
        Map<String, Object> person1 = new HashMap<>();
        person1.put("firstName", "Veronica");
        person1.put("lastName", "Green");
        person1.put("age", 46);

        System.out.println(trackAttendees(person1, "25"));
        // Output: {firstName=Veronica, lastName=Green, age=46, paidForTicket=25.0}

        Map<String, Object> person2 = new HashMap<>();
        person2.put("firstName", "Anna");
        person2.put("lastName", "Lytical");
        person2.put("age", 27);

        System.out.println(trackAttendees(person2, "0"));
        // Output: {firstName=Anna, lastName=Lytical, age=27, paidForTicket=0.0}

        Map<String, Object> person3 = new HashMap<>();
        person3.put("firstName", "Ella");
        person3.put("lastName", "Vaday");
        person3.put("age", 30);

        System.out.println(trackAttendees(person3, "13"));
        // Output: {firstName=Ella, lastName=Vaday, age=30, paidForTicket=13.0}
    }
}
```

# Can We Have the Party?

It's time to see if we can host our party!

Before the party is confirmed, the shareholders need two criteria to be met:

At least 5 people must be in attendance
At least £100 must be generated via pay-what-you-want ticket sales
The isPartyViable function will be called with an array of guest objects. Each of those objects has a paidForTicket property with a number representing how much they are willing to pay for their ticket.

It should return a boolean value of false if not enough people are attending or attendees don't spend enough money on tickets, and true if enough people are attending and they spend enough money on tickets.


```java
import java.util.List;
import java.util.Map;

public class PartyViabilityChecker {

    public static void main(String[] args) {
        // Example usage
        List<Map<String, Object>> guests1 = List.of(
                Map.of("name", "diya", "paidForTicket", 15),
                Map.of("name", "amul", "paidForTicket", 2),
                Map.of("name", "saleh", "paidForTicket", 2),
                Map.of("name", "philippa", "paidForTicket", 30)
        );
        System.out.println(isPartyViable(guests1)); // Output: false

        List<Map<String, Object>> guests2 = List.of(
                Map.of("name", "diya", "paidForTicket", 15),
                Map.of("name", "amul", "paidForTicket", 2),
                Map.of("name", "saleh", "paidForTicket", 2),
                Map.of("name", "philippa", "paidForTicket", 30),
                Map.of("name", "kev", "paidForTicket", 6),
                Map.of("name", "sarah", "paidForTicket", 11)
        );
        System.out.println(isPartyViable(guests2)); // Output: false

        List<Map<String, Object>> guests3 = List.of(
                Map.of("name", "diya", "paidForTicket", 15),
                Map.of("name", "amul", "paidForTicket", 20),
                Map.of("name", "saleh", "paidForTicket", 2),
                Map.of("name", "philippa", "paidForTicket", 30),
                Map.of("name", "kev", "paidForTicket", 26),
                Map.of("name", "sarah", "paidForTicket", 11)
        );
        System.out.println(isPartyViable(guests3)); // Output: true
    }
}
```

# Ordering Supplies
Hooray! The party has been given the go-ahead! Now it's time to write a function which will help us to order some supplies for the party.

Beicraft Events Supplies™️ sell a range of goods which can help us to throw an amazing party!

The orderSupplies function takes two arguments: a supplies object with keys of party supplies and values of the cost of that supply, and the number of guests attending.

It should return a number showing the total cost of ordering one of each item per guest!

```java
import java.util.Map;

public class PartySuppliesOrder {
    
    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> supplies1 = Map.of("cake", 2, "iceCream", 7);
        System.out.println(orderSupplies(supplies1, 2)); // Output: 18

        Map<String, Integer> supplies2 = Map.of("plates", 2, "cups", 1, "forks", 1, "partyHats", 4);
        System.out.println(orderSupplies(supplies2, 20)); // Output: 160
    }
}
```
# How Many Tables?

Hooray! The party can go ahead, the guest list is finalised, and it's almost time to make the seating plan. But first, you need to figure out how many tables we need!

The number of guests may not divide evenly by the number of seats, so we will have to add some extra chairs to a few of the tables for them.

The function calculateTables takes two arguments, the number of guests and the number of seats around a table.

It should return an object with two properties: a key of tables with the value of the number tables, and a key of remainingGuests with a value of the number of guests without a seat who will need to be added to one of the other tables.


```java
public class TableCalculator {

    public static void main(String[] args) {
        // Example usage
        TableResult result1 = calculateTables(4, 2);
        System.out.println("Tables: " + result1.getTables() + ", Remaining Guests: " + result1.getRemainingGuests());
        // Output: Tables: 2, Remaining Guests: 0

        TableResult result2 = calculateTables(14, 6);
        System.out.println("Tables: " + result2.getTables() + ", Remaining Guests: " + result2.getRemainingGuests());
        // Output: Tables: 2, Remaining Guests: 2

        TableResult result3 = calculateTables(26, 5);
        System.out.println("Tables: " + result3.getTables() + ", Remaining Guests: " + result3.getRemainingGuests());
        // Output: Tables: 5, Remaining Guests: 1
    }
}
```

# Taxi Fare Calculator

Beicraft drivers Taxi Company™️ have asked for your help writing a function which will calculate the cost of getting to the party! Journeys are priced as follows:

Journeys up to 3 minutes long have a flat base rate cost of £5
Every minute after the first 3 will cost an extra 70p
The length of the journey is always rounded up to a whole number of minutes
The calculateTaxiFare function should take a number representing the length of a taxi journey in seconds, and return a number representing the cost of that journey in pence.


```java
public class TaxiFareCalculator {


    public static void main(String[] args) {
        // Example usage
        System.out.println(calculateTaxiFare(150)); // Output: 500
        System.out.println(calculateTaxiFare(360)); // Output: 710
        System.out.println(calculateTaxiFare(491)); // Output: 920
    }
}
```

# Who are the Winners?

The Beicraft party is nearly over & it's time to select the winners of the prize draw raffle!

You have been asked to write a function which will select the winners based on two factors: how much they paid, and their seat number. If both of these numbers are odd, the attendee wins a prize!

The pickWinners function will be passed an array of numbers representing ticket costs as its only argument. The index position represents the seat number.

Your task is to return an array of objects. Each object should contain two keys. The first key is seat with a value of the odd index. The second key is ticketCost with a value of the ticket price at that index in the input array.

Certainly! Here's the equivalent solution in Java:

```java
import java.util.ArrayList;
import java.util.List;

public class PrizeDrawPicker {

    public static void main(String[] args) {
        // Example usage
        List<Integer> numbers1 = List.of(6, 7, 12, 49);
        System.out.println(pickWinners(numbers1));
        // Output: [Winner{seat=1, ticketCost=7}, Winner{seat=3, ticketCost=49}]

        List<Integer> numbers2 = List.of(1, 3, 5, 7, 9, 11);
        System.out.println(pickWinners(numbers2));
        // Output: [Winner{seat=1, ticketCost=3}, Winner{seat=3, ticketCost=7}, Winner{seat=5, ticketCost=11}]

        List<Integer> numbers3 = List.of(1, 6, 13, 8, 29, 50);
        System.out.println(pickWinners(numbers3));
        // Output: []
    }
}
```

# Gathering Feedback

Phew! All your hard work paid off and the event was a success! Now that you have had some time to relax, it's time to consider the guests feedback.

You decide to break the feedback into three groups: positive (7-10), negative (0-3) or neutral (4-6).

The function gatherFeedback takes an array of arrays, each of these arrays contains both a string of the name of the attendee and a number showing how they rated the party out of 10.

It should return an object with three properties: a key of positive with a value of the number of positive reviews; a key of negative with a value of the number of negative reviews; and, a key of neutral with a value of the number of neutral reviews.

Certainly! Here's the equivalent solution in Java:

```java
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedbackGatherer {

    public static void main(String[] args) {
        // Example usage
        List<List<Object>> feedback1 = List.of(
                List.of("maddie", 10),
                List.of("jatinder", 3),
                List.of("rose", 6)
        );
        System.out.println(gatherFeedback(feedback1));
        // Output: {positive=1, negative=1, neutral=1}

        List<List<Object>> feedback2 = List.of(
                List.of("maddie", 10),
                List.of("jatinder", 10),
                List.of("rose", 10)
        );
        System.out.println(gatherFeedback(feedback2));
        // Output: {positive=3, negative=0, neutral=0}

        List<List<Object>> feedback3 = List.of(
                List.of("maddie", 10),
                List.of("jatinder", 10),
                List.of("rose", 1)
        );
        System.out.println(gatherFeedback(feedback3));
        // Output: {positive=2, negative=1, neutral=0}
    }
}
```