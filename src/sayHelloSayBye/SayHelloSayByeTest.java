package sayHelloSayBye;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SayHelloSayByeTest {

    @Test
    public void nothing() {

    }
    @Test
    public void givenNameOne_returnsHelloName() {
        SayHelloSayBye sayHelloSayBye = new SayHelloSayBye();
        String nameGreeting = sayHelloSayBye.findHelloOrBye("alon", 1);
        assertEquals("Hello Alon",nameGreeting);
    }

    @Test
    public void givenNameZero_returnsByeName() {
        SayHelloSayBye sayHelloSayBye = new SayHelloSayBye();
        String nameGreeting = sayHelloSayBye.findHelloOrBye("vinod", 0);
        assertEquals("Bye Vinod",nameGreeting);
    }

    @Test
    public void givenNameInUpperCaseOne_returnsHelloName() {
        SayHelloSayBye sayHelloSayBye = new SayHelloSayBye();
        String nameGreeting = sayHelloSayBye.findHelloOrBye("Vissu", 1);
        assertEquals("Hello Vissu",nameGreeting);
    }

    @Test
    public void givenNameInLowerCaseOne_returnsHelloName() {
        SayHelloSayBye sayHelloSayBye = new SayHelloSayBye();
        String nameGreeting = sayHelloSayBye.findHelloOrBye("renu", 1);
        assertEquals("Hello Renu",nameGreeting);
    }

    @Test
    public void givenNameInUpperCaseZero_returnsByeName() {
        SayHelloSayBye sayHelloSayBye = new SayHelloSayBye();
        String nameGreeting = sayHelloSayBye.findHelloOrBye("Sumanth", 0);
        assertEquals("Bye Sumanth",nameGreeting);
    }
}
