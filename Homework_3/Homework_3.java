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

        /* 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
        Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        Результат: ["string", "s", "my_value"]
         */
        ArrayList<String> list = new ArrayList<>( List.of( "string","-14","num","51","12","int","-10","2311", "0","-123" ,"123", "java", "5", "python", "-12") );
        System.out.println( "Изначальный список: " + list );
        removeDigit( list );
        System.out.println( "Итоговый список без чисел: " + list );

    }

    static ArrayList<Integer> randomArraylist() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { list.add(new Random().nextInt(1, 10)); };
        return list;
    }

    static void removeDigit(ArrayList<String> inputList) {
        Iterator<String> stringsList = inputList.iterator();
        while (stringsList.hasNext()) {
            String s = stringsList.next();
            if (Character.isDigit( s.charAt( 0 )) && s.length() == 1) {
                stringsList.remove();
            } else if (s.length() > 1 && s.charAt( 0 ) == '-') {
                int count = 0;
                for (int i = 1; i < s.length(); i++) {
                        if (Character.isDigit(s.charAt( i ))) {
                            count = count + 1;
                        }
                    }
                if (s.length() - 1  == count) {
                    stringsList.remove();
                }
            } else {
                int count = 0;
                for (int i = 0; i < s.length(); i++)
                    if (Character.isDigit( s.charAt( i ) )) {
                        count = count + 1;
                    }
                if (s.length() == count) {
                    stringsList.remove();
                }
            }
        }
    }
}