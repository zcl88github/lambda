import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Constructor {
    public static void main(String[] args) {
        Supplier<Person> s = () -> new Person();
        Supplier<Person> s1 = Person::new;
        s.get();
        s1.get();

        Supplier<List> s2 = ArrayList::new;

        Consumer<Integer> c = (age) -> new Account(age);
        Consumer<Integer> c2 = Account::new;
        c2.accept(123);

  //      Function<String, Integer> fu = String::new;
    }
}

class Person {
    public Person () {
        System.out.println("new Person()");
    }
}

class Account {
    public Account () {
        System.out.println("");
    }
    public Account (int age) {
        System.out.println(age);
    }
}