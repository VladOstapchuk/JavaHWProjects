package homeworks.io;

import java.io.File;
import java.io.IOException;

public class MainIO {
    public static void main(String[] args) {

        File file2 = new File("a.txt");

        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File folder = new File("A");
        folder.mkdirs();

        File file3 = new File(folder, "b.txt");
        try {
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }




        File file = new File(".");
        File[] fileArray = file.listFiles();
        for (File fileforeach : fileArray ) {
            long fileSize = fileforeach.length();
            String type = (fileforeach.isFile())?"File":"Dir";
            System.out.println(fileforeach.getName() + "\t"+ type + "\t" + fileSize);

        }



//        Delete Folder A
//        System.out.println("folder A");
//
//        File filedelete = new File("C:\\Users\\ostapchukvo\\IdeaProjects\\JavaHWProjects\\A");
//        File[] filedelete1 = filedelete.listFiles();
//        for (File fileforeach : filedelete1 ) {
//            long fileSize = fileforeach.length();
//            String type = (fileforeach.isFile())?"File":"Dir";
//            System.out.println(fileforeach.getName() + "\t"+ type + "\t" + fileSize);
//            fileforeach.delete();
//
//        }
//        folder.delete();

        System.out.println();
        System.out.println();
        System.out.println();

        Filtring findext = new Filtring("pdf", "txt");
        File[] filelast = folder.listFiles(findext);

        for (File files: filelast
             ) {
            System.out.println(files);

        }



    }
}
