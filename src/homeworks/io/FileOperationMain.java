package homeworks.io;

import java.io.File;
import java.io.IOException;

public class FileOperationMain {

    public static void main(String[] args) {

        File in = new File("C:\\Users\\ostapchukvo\\Desktop\\Bug_Reports\\Teller_17122022\\1.jpg");
        File out = new File("output.jpg");

        try {
            FileOperation.fileCopy(in, out);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
