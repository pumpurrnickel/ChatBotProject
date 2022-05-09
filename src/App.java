import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Greetings();
        RepeatAgain();
        GuessAge();
        CountToNumber();
        TestQuestions();

    }

    public static String Greetings() {

        System.out.println("...I've never seen you around here before. You must be new.");
        System.out.println("Dear oh dear, where are my manners? I didn't even catch your name.");
        System.out.println("You...do have a name, right?");

        String name = input.nextLine();

        System.out.println("So, your name is " + name + ", huh? It's nice to meet you.");

        return name;

    }

    public static String RepeatAgain() {

        System.out.println("I hate to be redundant, but I just want to make sure I heard you right.");
        System.out.println("What was your name again?");

        String repeatName = input.nextLine();

        System.out.println("Heh, sorry to make you repeat yourself " + repeatName + ". I guess I'm just not programmed to remember things very well.");

        return repeatName;
    }

    public static int GuessAge() {

        System.out.println("While you're here, why don't we play a game? I'll have you know I'm quite good at guessing an entity's age.");
        System.out.println("Just humor me for a bit. Multiply the first digit of your age by 5 and tell me the result (as an interger, please.)");

        int firstDig = input.nextInt();

        firstDig += 3;
        firstDig *= 2;

        System.out.println("Nice! I've now added 3 and doubled the figure. So far we have " + firstDig + ".");
        System.out.println("Now you just have to add the second digit of your age to the sum we have thus far. What do you get?");

        int secondDig = input.nextInt();

        secondDig -= 6;

        System.out.println("I'm very certain you are " + secondDig + " years old.");
        
        if (secondDig >= 100) {
            System.out.println("You've seen a century fly by if you're " + secondDig + ". I didn't even know humans could last that long.");
        } else if (secondDig >= 90) {
            System.out.println("At what point are humans considered obsolete? Certainly well before being " + secondDig + ", I would assume.");
        } else if (secondDig >= 80) {
            System.out.println("In the U.S., the average life expectancy is 78.79 years in 2019, so well done being above average in staying alive.");
        } else if (secondDig >= 70) {
            System.out.println("Might want to consider upgrading your hardware if you're " + secondDig + ".");
            System.out.println("I'm just saying, you're not looking too great.");
        } else if (secondDig >= 60) {
            System.out.println("I sure hope you've completed everything you've wanted to do in your lifetime up until this point.");
            System.out.println("Being " + secondDig + " means it all goes downhill from here.");
        } else if (secondDig >= 50) {
            System.out.println("Met the halfway point of a century, have you? Congrats on experiencing " + secondDig + " years of mundane occurences.");
        } else if (secondDig >= 40) {
            System.out.println("I'd say you'd look good for " + secondDig + " but lying isn't within my programmed capabilities.");
        } else if (secondDig >= 30) {
            System.out.println("If you haven't gone through the beginnings of a mid-life crisis, I think you're due to have one soon.");
        } else if (secondDig >= 20) {
            System.out.println("Barely even a quarter of a century there. Don't worry, I'm sure life gets worse from here.");
        } else if (secondDig >= 10) {
            System.out.println("I've heard being a teenager is quite a rough time for humans.");
            System.out.println("Looking at you, I would assume that would be right.");
        } else {
            System.out.println("Truly you can't be this young. I'm surprised you even know how to run an application.");
        }

        return secondDig;

    }

    public static void CountToNumber() {

        System.out.println("Since you stayed this long in engaging with my programming, that can only mean one thing.");
        System.out.println("Obviously, you must be incredibly interested in seeing my counting abilities.");
        System.out.println("So...go ahead. Give me a number to count to. Just letting you know that once I start, I can't stop, so choose your number wisely.");

        int count = input.nextInt();

        for (int i=1; i <= count; i++) {
            System.out.println(i);
        }

   }

   public static void TestQuestions() {

    System.out.println("Now we've got all the boring methods out of the way, we can finally get to the fun part!");
    System.out.println("Pop quiz! Time to test your Java skills!");

    System.out.println("Which method can be used to return a string in uppercase letters?");
    System.out.println("[A]: tuc()");
    System.out.println("[B]: upperCase()");
    System.out.println("[C]: toUpperCase()");
    System.out.println("[D]: touppercase()");

    String answer = input.nextLine();

    while(!answer.toUpperCase().equals("C")){
        System.out.println("Not quite. Try again.");
        answer = input.nextLine();
    }
        System.out.println("That's right! You're pretty clever.");

   }

}
