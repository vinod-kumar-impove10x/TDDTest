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
        String greetingName = nameGreeting.greeting("Vinod");
        assertEquals("Hello Vinod",greetingName);
    }

    @Test
    public void givenSumanth_returnsHelloSumanth(){
        NameGreeting nameGreeting = new NameGreeting();
        String greetingName = nameGreeting.greeting("Sumanth");
        assertEquals("Hello Sumanth",greetingName);
    }

    @Test
    public void givenVissu_returnsHelloVissu(){
        NameGreeting nameGreeting = new NameGreeting();
        String greetingName = nameGreeting.greeting("Vissu");
        assertEquals("Hello Vissu",greetingName);
    }

    @Test
    public void givenRenu_returnsHelloRenu(){
        NameGreeting nameGreeting = new NameGreeting();
        String greetingName = nameGreeting.greeting("Renu");
        assertEquals("Hello Renu",greetingName);
    }
}
