import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator(10000, 10000);
        fileCreator.create();
        FileReaderToList fileReaderToList = new FileReaderToList(10000);
        ArrayList<Integer> arrayList = fileReaderToList.read();
        Calculator calc = new Calculator();
        calc.sum(arrayList);
        calc.max(arrayList);
        calc.min(arrayList);
        calc.minValue(arrayList);
        calc.maxValue(arrayList);

    }
}