package sayHelloSayBye;

public class Greeting {
    public String findGreeting(String name, int num) {
        String result;
        if (num == 1) {
            result = "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1);
        } else {
            result = "Bye " + name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        return result;
    }
}
