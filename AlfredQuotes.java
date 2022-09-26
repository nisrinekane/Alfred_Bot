import java.util.Date;
import java.util.Calendar;
import java.util.Random;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return  String.format("%s %s!", name, basicGreeting());
    }

    public String dateAnnouncement() {
        Calendar current = Calendar.getInstance();
        Date date = new Date();
        int hour = current.get(Calendar.HOUR_OF_DAY);
        String itIsCurrent = "It is currently";
        //switch for time of day
        if (hour < 12) {
            return String.format("Good morning. %s %s", itIsCurrent, date);
        } else if (hour < 17) {
            return String.format("Good afternoon. %s %s", itIsCurrent, date);
        } else {
            return String.format("Good evening. %s %s", itIsCurrent, date);
        }
    }


    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if(conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    public String getMeetings() {
        Random rand = new Random(); //instance of random class
        int int_random = rand.nextInt(8);
        return String.format("You have %d meetings today sir.", int_random);
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

