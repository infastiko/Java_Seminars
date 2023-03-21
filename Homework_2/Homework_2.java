import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

static String buildString(int n, char c1, char c2) {
    if (n % 2 == 0) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sb.append(c1);
            else sb.append(c2);
        }
        return sb.toString();
    } else return "n not even. Exit program.";
}
