package Three.four.classWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/main/java/Three/threeFour/classWork/file.txt");

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int value;
            while ((value = fileInputStream.read()) != -1) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Произошла ошибка. Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Произошла ошибка ввода-вывода");
            e.printStackTrace();
        }

    }
}