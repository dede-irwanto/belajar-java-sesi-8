package dede.irwanto.lambda.app;

import java.util.Optional;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("dede");
        sayHello(null);
    }
    public static void sayHello(String name) {
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());

        optionalNameUpper.ifPresentOrElse(
                value -> System.out.println("HELLO " + value),
                () -> System.out.println("HELLO")
        );
    }
}
