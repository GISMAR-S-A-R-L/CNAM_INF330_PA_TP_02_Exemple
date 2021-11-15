import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount1 {
    public static void main(String[] args) {
        Map<String, Long> counterMap = new HashMap<>();
        //String[] COUNTRY_NAMES
        //        = {"China", "Australia", "India", "USA", "USSR", "UK", "China",
        //        "France", "Poland", "Austria", "India", "USA", "Egypt", "China"};

        InputStream stream = Lecture05FichierUsingInputStreamWtihScanner.class.getResourceAsStream("data.txt");
        Scanner scanner = new Scanner(stream);
        while (scanner.hasNext()) {
            String[] lieWords = scanner.nextLine().split(" ");
            counterMap = Arrays.stream(lieWords)
                    .collect(Collectors.groupingBy(
                            Function.identity(), Collectors.counting()
                    ));
        }



        System.out.println(counterMap);
    }
}
