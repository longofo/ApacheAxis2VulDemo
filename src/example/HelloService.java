package example;

public class HelloService {
    public String sayHello(String name, byte[] bytes) {
        return "Hello," + name + new String(bytes);
    }
}
