import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
//        System.out.println("The values from start to finish, including the end values, are: " + valuesBetweenIncludingEnds(5, 10));
        int values = valuesBetweenIncludingEnds(5,10);
    }

    public List<Integer> valuesBetweenIncludingEnds(int a, int b) {
        int aux = 0;
        if (a > b) {
            aux = b;
            b = a;
            a = aux;
        }
        List<Integer> range = new ArrayList<>(b - a + 1);
        for (int i =  a; i <= b; i++){
            range.add(i);
        }
        System.out.println(range);
        return range;
    }
}
