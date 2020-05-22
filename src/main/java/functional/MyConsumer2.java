package functional;

import java.util.function.Consumer;

public class MyConsumer2 implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
      System.out.println("Hey " + integer);
    }
}
