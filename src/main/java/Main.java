import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Insert exactly one filepath.");
            return;
        }
        Path source = Paths.get(args[0]);
        if (!Files.exists(source)) {
            System.out.println("File does not exist.");
            return;
        }

        String src = source.toString();
        String[] source_arr = src.split("\\.");
        if (source_arr.length != 2) {
            System.out.println("Filepath has no or too many dots. " + src);
            return;
        }

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss");
        String strDate = formatter.format(date);

        Path target = Paths.get(source_arr[0] + strDate + "." + source_arr[1]);

        Files.copy(source, target);
    }
}
