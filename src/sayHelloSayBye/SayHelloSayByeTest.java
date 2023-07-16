package sayHelloSayBye;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SayHelloSayByeTest {

    @Test
    public void nothing() {

    }
    @Test
    public void givenNameOne_returnsHelloName() {
        Greeting greeting = new Greeting();
        String nameGreeting = greeting.findGreeting("alon", 1);
        assertEquals("Hello Alon",nameGreeting);
    }

    @Test
    public void givenNameZero_returnsByeName() {
        Greeting greeting = new Greeting();
        String nameGreeting = greeting.findGreeting("vinod", 0);
        assertEquals("Bye Vinod",nameGreeting);
    }

    @Test
    public void givenNameInUpperCaseOne_returnsHelloName() {
        Greeting greeting = new Greeting();
        String nameGreeting = greeting.findGreeting("Vissu", 1);
        assertEquals("Hello Vissu",nameGreeting);
    }

    @Test
    public void givenNameInLowerCaseOne_returnsHelloName() {
        Greeting greeting = new Greeting();
        String nameGreeting = greeting.findGreeting("renu", 1);
        assertEquals("Hello Renu",nameGreeting);
    }

    @Test
    public void givenNameInUpperCaseZero_returnsByeName() {
        Greeting greeting = new Greeting();
        String nameGreeting = greeting.findGreeting("Sumanth", 0);
        assertEquals("Bye Sumanth",nameGreeting);
    }
}
