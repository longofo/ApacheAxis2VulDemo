package example;

public class TestService {
    public String test(String name, byte[] bytes) {
        return "Test," + name + new String(bytes);
    }
}
