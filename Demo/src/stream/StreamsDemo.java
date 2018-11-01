package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        int no [] = { 1,2,3,4,5,6};
        Arrays.stream(no)
            .filter(n -> n%3 == 0 || n%5 == 0)
            .forEach(System.out::print);
        
        System.out.println("");
        
        int no1 [] = {12, 21, 32, 45, 52, 63};
        Arrays.stream(no1)
            .filter(n -> n%3 == 0)
            .map(n -> ++n)
            .filter(n -> n%8 == 0)
            .forEach(System.out::println);
        
        Stream<String> msg = Stream.of("Java8 ", "in ", "Action ");
        msg.forEach(System.out::print);
        msg.forEach(System.out::print);
   
    }
}
