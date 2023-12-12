package applysingleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("log.txt");
        writer = new FileWriter(file, true); // true 설정 시 기록
    }

    public void log(String message) throws IOException {
        writer.write(message);
    }
}
