import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileCreator {
     int n;
     int max;

    FileCreator (int a, int b){
        n = a;
        max = b;

    } //конструктор который принимает значения

    void create() {
        try {
            File file = new File("src\\Resources\\inputData.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Random random = new Random();


            for (int i = 0; i < n; i++) {
                bufferedWriter.write(String.valueOf(random.nextInt(max) - max / 2)); //записывает в файл рандомные числа от 10000 до 4999
                bufferedWriter.newLine(); //переход на новую строку
            }

            bufferedWriter.close(); //нужно закрыть файл
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
