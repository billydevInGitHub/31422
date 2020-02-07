package billydev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<String> rows= Arrays.asList("test 1234", "test 5678", "not selected 545");
        Stream<String> lines=rows.stream();
        lines.filter(line->line.contains("test"))
                .map(line->line.split(" "))
                .map(arr->arr[arr.length-1])
                .forEach(field-> System.out.println(field));
    }
}
