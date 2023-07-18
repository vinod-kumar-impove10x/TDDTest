package nameGreeting;

public class NameGreeting {
    public String addGreetingWithName(String name) {
        if (name == ""){
            return "Enter your name";
        } else {
            String greetingHelloName = "Hello " + name + "!";
            return greetingHelloName;
        }
    }
}
