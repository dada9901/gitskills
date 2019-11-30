package ShiftLetter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public FileWrite(String fileName,String content) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(content);
            fw.close();
        }
        catch(IOException e) {
            System.out.println(e.toString());
        }
    }
}
