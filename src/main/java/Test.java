import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.Closeable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        BigDecimal a = new BigDecimal("200");
        System.out.println(a);
        BigDecimal b = a.add(new BigDecimal("300"));
        System.out.println(a);
        System.out.println(b);

        LocalDate day = LocalDate.now();
        System.out.println(day);
        LocalDate day1 = day.plusDays(2);
        System.out.println(day1);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-------------");
            }
        });
        new Thread();
    }

    @org.junit.Test
    public void test() throws Exception {
       Runnable r1 = new Runnable() {
           @Override
           public void run() {
               System.out.println("------------");
           }
       };

       r1.run();
       Runnable r2 = () -> {
           System.out.println("------------");
       };

        Callable<String> c1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello";
            }
        };

        Callable<String> c2 = () -> {
            return "hello";
        };

        Callable<String> c3 = () -> "hello";
        System.out.println(c1.call());
        System.out.println(c2.call());
        System.out.println(c3.call());

        UserMapper userMapper = new UserMapper() {
            @Override
            public void inset(User user) {
                System.out.println("inser User");
            }
        };
        UserMapper userMapper1 = (user) -> {
            System.out.println("inser userMapper1");
        };

        UserMapper userMapper2 = (User user) -> {
            System.out.println("inser userMapper2");
        };

//        userMapper.inset(new User());
//        userMapper1.inset(new User());
//        userMapper2.inset(new User());

        Function<Integer, Integer> f1 = a -> {
            int sum = 0;
            for (int i = 0; i <=a; i++) {
                sum += i;
            }
            return sum;
        };
        System.out.println(f1.apply(100));

        Foo foo = () -> 100;
        Foo foo1 = () -> true ? 1 : -1;

        BiFunction<String, String, Integer> bf = (a, b) -> a.length() + b.length();
        System.out.println(bf.apply("java", "se"));

        Function<String, Integer> f6 = a -> {
            return a.length();
        };
        System.out.println(f6.apply("sdsfsfsdssd"));
    }

    @org.junit.Test
    public void testStream() {
        Runnable r = () -> { };
        Closeable c = () -> { };
        Supplier<String> s1 = () -> "hello";

        Supplier<String> s2 = () -> {
            return "hello";
        };

        Function<String, Integer> f1 = (str) -> Integer.valueOf(str);

    }

    @org.junit.Test
    public void testFunction() {
        Function<String, String> fn = str -> str.toUpperCase();
        System.out.println(fn.apply("222222fsdfsfdsfsdffs"));
        Consumer<String> c = a -> {
            System.out.println(a);
        };
        c.accept("hello");
    }

    public static String get() {
        return "hello";
    }

    @org.junit.Test
    public void testFun() {
        Supplier<String> s = () -> Test.get();
        Supplier<String> s1 = Test::get;
        System.out.println(s.get());
        System.out.println(s1.get());
    }
}


interface UserMapper {
    void inset(User user);
}

interface OrderMapper {
    int insert(Order order);
}

interface Foo {
    int get();
}
