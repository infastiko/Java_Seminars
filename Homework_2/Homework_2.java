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

static void saveFile(String createdString) {
    try {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file_ab.txt");
        File file = new File(pathFile);

        if (file.createNewFile()) {
            System.out.println("file.created");
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(createdString);
            fileWriter.flush();
            fileWriter.close();
        } else {
            System.out.println("file.existed");
        }
    } catch (Exception e) {
        e.getMessage();
    } finally {
        System.out.println(createdString);
    }
}
