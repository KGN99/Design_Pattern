package strategy;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Base64Strategy base64 = new Base64Strategy();
        NormalStrategy normal = new NormalStrategy();
        AppendStrategy append = new AppendStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);

        encoder.setEncodingStrategy(append);
        String appendResult = encoder.getMessage(message);

        System.out.println(base64Result);
        System.out.println(normalResult);
        System.out.println(appendResult);
    }
}
