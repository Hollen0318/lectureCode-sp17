import java.util.Set;

public class testEquals {
    public static void main(String[] args) {
        Set<Integer> javaset = Set.of(5, 23, 42);
        Set<Integer> javaset2 = Set.of(5,23,42);
        System.out.println(javaset2.equals(javaset));
        System.out.println(javaset2 == javaset);
    }
}
