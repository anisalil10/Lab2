import java.util.List;

public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    @org.jetbrains.annotations.Contract(pure = true)
    public static long sum(List<Integer> numbers) {

        long s = 0L;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
