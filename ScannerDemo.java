import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Hello How r u\n I am Fine\n Thank u\n");
        // int wordCounter = 0;
        // while (scanner.hasNext()) {
        // wordCounter++;
        // System.out.println(scanner.next()); // give current value and move to next
        // }                                   //Scanner is a buffer, We take user input from System.in
        // System.out.println(wordCounter);
        int lineCount = 0;
        while (scanner.hasNextLine()) {
            lineCount++;
            System.out.println(scanner.nextLine());
        }
        System.out.println(lineCount);
        scanner.close();

    }
}