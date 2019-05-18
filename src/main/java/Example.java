import sun.applet.Main;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Example {

    public static void main(String[] args) {
        Consumer<Too> c = (too) -> new Too().foo();
        Consumer<Too> c1 = Too::foo;
        c1.accept(new Too());
        BiConsumer<Too2, String> c5 = (too2, str) -> new Too2().fo(str);
        BiConsumer<Too2, String> c6 = Too2::fo;
        c5.accept(new Too2(), "dddddd");
        c6.accept(new Too2(), "ddddddxxxxxxx");
        BiFunction<Prod, String, Integer> bf1 = (p, s) -> new Prod().fun(s);
        BiFunction<Prod, String, Integer> bf2 = Prod::fun;

        System.out.println(bf2.apply(new Prod(), "555"));
    }
}

class Too {
    public void foo() {
        System.out.println("invoke");
    }
}


class Too2 {
    public void foo() {
        System.out.println("invoke");
    }

    public void fo(String str) {
        System.out.println(str);
    }
}

class Prod {
    public Integer fun(String s) {
        return 1;
    }
}
