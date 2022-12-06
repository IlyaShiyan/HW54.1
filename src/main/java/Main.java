import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashSet<String> numbers = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] subStr = str.split(",");
        for (String i: subStr) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
