package billydev.bar;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ClassUseCallback {

    Consumer consumer;

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public void operate() {
        System.out.println("this is information from ClassUseCallback!");
        consumer.accept(null);
    }
}
