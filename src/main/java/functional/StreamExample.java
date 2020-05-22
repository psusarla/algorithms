package functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        System.out.println("Max is " + sequentialStream.max(Integer::compareTo));
        myList.stream().filter(i -> i >60).forEach(i -> System.out.print(i + " "));

        Collection<Integer> c = myList;
        c.removeIf(i -> i<90);
        System.out.println("After removing");
        c.stream().forEach(i -> System.out.print(i + " "));

        c.spliterator();
       // myList.stream().
        /*
        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High Nums parallel="+p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
*/
    }

}
