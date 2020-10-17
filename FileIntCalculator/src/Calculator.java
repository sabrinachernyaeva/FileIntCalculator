import java.util.ArrayList;

public class Calculator {

    int sum(ArrayList<Integer> arrayList) {
        int answer = arrayList.stream().reduce((x, y) -> x + y).get();
        System.out.println(answer);
        return answer;
    }

    int min(ArrayList<Integer> arrayList) {
        int answer = (int) arrayList.stream().filter((x) -> (x < 0)).count();
        System.out.println(answer);
        return (int) answer;
    }

    int max(ArrayList<Integer> arrayList) {
        int answer = (int) arrayList.stream().filter((x) -> (x > 0)).count();
        System.out.println(answer);
        return (int) answer;
    }

    Integer minValue(ArrayList<Integer> arrayList) {
        Integer answer = arrayList.stream().reduce(Math::min).get();
        System.out.println(answer);
        return answer;
    }

    Integer maxValue(ArrayList<Integer> arrayList) {
        Integer answer = arrayList.stream().reduce(Math::max).get();
        System.out.println(answer);
        return answer;
    }
}
