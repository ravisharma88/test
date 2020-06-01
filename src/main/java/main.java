import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String []args){
        System.out.println("First project on mac");
        runSomeStream();
    }

    private static void runSomeStream() {
        List<String> strings = Arrays.asList(new String[]{"ravi","sharma","upasana"});
        strings.stream()
                .filter(i -> i.length() <= 6 )
                .forEach(System.out::println);
    }
}
