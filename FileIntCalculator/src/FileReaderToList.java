import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileReaderToList {
    int n;

    FileReaderToList(int a){
        n = a;
    }

    ArrayList<Integer> read() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        try {
            File file = new File("src\\Resources\\inputData.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            for (int i = 0; i < n; i++) {
                arrayList.add(Integer.parseInt(bufferedReader.readLine()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
