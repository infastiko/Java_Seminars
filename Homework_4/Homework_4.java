import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Homework_4 {

    static String input() {
        String s = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print( "Введите строку вида, например string~1 : " );
            s = br.readLine().strip();
        } catch (IOException e) { System.out.println(e.getMessage()); }
        return s;
    }