import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
    static void gen1() {
        String[] arr = {"a", "b", "c", "1"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach(System.out::println);
    }

    static void gen2() {
        List<String> list = Arrays.asList("a", "b", "c", "1");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }

    static void gen3() {
        Stream<Integer> stream = Stream.generate(() -> 1);
        stream.limit(10).forEach(System.out::println);
    }

    static void gen4() {
        Stream<Integer> stream = Stream.iterate(1, x -> x + 1);
        stream.limit(10).forEach(System.out::println);
    }

    @Test
    static void gen5() {
        String str = "abddesfsdg12345";
        IntStream stream = str.chars();
        stream.forEach(System.out::println);
    }

    public static void main(String[] args) {
//        gen1();
//        gen2();
//        gen3();
//        gen4();
//        gen5();
//        Arrays.asList(1, 2, 3, 4, 5).stream().filter(x -> x % 2 == 0).forEach(System.out::println);;
//
//        int sum = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
//        System.out.println(sum);
//
//        int max =  Arrays.asList(1, 2, 3, 4, 5, 6).stream().max((a, b) -> a - b).get();
//        System.out.println(max);
//
//        int min =  Arrays.asList(1, 2, 3, 4, 5, 6).stream().min((a, b) -> a - b).get();
//        System.out.println(min);
//
//        Optional<Integer> any = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).findAny();
//        System.out.println(any.get());
//        Optional<Integer> first = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).findFirst();
//        System.out.println(first.get());
//
//        Optional<Integer> first1 = Arrays.asList(1, 2, 3, 4, 5, 6).stream().sorted((a, b) -> b - a).findFirst();
//        System.out.println(first1.get());
//
//
//        Arrays.asList(13, 11, 8, 7, 52, 6).stream().sorted((a, b) -> b - a).forEach(System.out::println);
//
//        Arrays.asList("adb", "dd", "afsdafsfsdf", "s").stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);
//
//        Stream.iterate(1, x -> x + 1).limit(50).filter(x -> x % 2 == 0).forEach(System.out::println);

//        List<Integer> list =Stream.iterate(1, x -> x + 1).limit(50).filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(list);

//        Arrays.asList(1, 3, 4, 2, 2, 4).stream().distinct().forEach(System.out::println);

//          Object[] arr = Stream.iterate(1, x -> x + 1).limit(50).sorted((a, b) -> b - a).skip(40).toArray();
//        System.out.println(Arrays.toString(arr));
//        String str = "11,22,33,44,55";
//        int sum = Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum();
//        System.out.println(sum);
//
//        int sum1 = Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum();
//        System.out.println(sum1);

        String str = "tomcat, nginx, apache, jetty";
        Stream.of(str.split(",")).map((x) -> x + 1).forEach(System.out::println);
//        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "10");
//        Stream.iterate(1, x -> x + 1).limit(50).parallel().peek(x -> {
//
//            System.out.println(Thread.currentThread().getName());
//        }).forEach(System.out::println);
    }

}

