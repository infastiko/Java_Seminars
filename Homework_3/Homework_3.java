import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Homework_3 {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> randomArraylist() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { list.add(new Random().nextInt(1, 10)); };
        return list;
    }