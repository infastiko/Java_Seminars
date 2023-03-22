import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Homework_3 {
    public static void main(String[] args) {
        // 1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        ArrayList<Integer> randomList = randomArraylist();
        System.out.println( "Изначальныйй список: " + randomList );
        randomList.removeIf( s -> s % 2 == 1 );
        System.out.println( "Итоговый список без нечетных чисел: " + randomList + "\n" );

    }

    static ArrayList<Integer> randomArraylist() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { list.add(new Random().nextInt(1, 10)); };
        return list;
    }
}