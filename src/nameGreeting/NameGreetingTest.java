package nameGreeting;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NameGreetingTest {
    @Test
    public void nothing(){

    }

    @Test
    public void givenVinod_returnsHelloVinod(){
        NameGreeting nameGreeting = new NameGreeting();
        String greetingName = nameGreeting.addGreetingWithName("Vinod");
        assertEquals("Hello Vinod!",greetingName);
    }

    @Test
    public void givenSumanth_returnsHelloSumanth(){
        NameGreeting nameGreeting = new NameGreeting();
        String greetingName = nameGreeting.addGreetingWithName("Sumanth");
        assertEquals("Hello Sumanth!",greetingName);
    }

    @Test
    public void givenVissu_returnsHelloVissu(){
        NameGreeting nameGreeting = new NameGreeting();
        String greetingName = nameGreeting.addGreetingWithName("Vissu");
        assertEquals("Hello Vissu!",greetingName);
    }

    @Test
    public void givenRenu_returnsHelloRenu(){
        NameGreeting nameGreeting = new NameGreeting();
        String greetingName = nameGreeting.addGreetingWithName("Renu");
        assertEquals("Hello Renu!",greetingName);
    }

    @Test
    public void givenEmpty_returnsEnterYourName(){
        NameGreeting nameGreeting = new NameGreeting();
        String greetingName = nameGreeting.addGreetingWithName("");
        assertEquals("Enter your name",greetingName);
    }
}
