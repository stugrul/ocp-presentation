package exceptions.multicatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (DateTimeException e) {
            e.printStackTrace();
            throw new RuntimeException();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
