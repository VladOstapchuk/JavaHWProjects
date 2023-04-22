package homeworks.io.ioHomework;

import homeworks.io.FileOperation;
import homeworks.io.Filtring;

import java.io.File;
import java.io.IOException;

public class copyDocsFiles {

    public static void main(String[] args) {

        File folderIn = new File("SuperIN");
        File folderOut = new File("SuperOUT");

            folderIn.mkdirs();
            folderOut.mkdirs();

            File file1txt = new File(folderIn,"aa.txt");
        try {
            file1txt.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File listFiles = new File(".");
            File[] arrayInFolder = listFiles.listFiles();
        for (File eachfile: arrayInFolder
             ) {
            String type = eachfile.isFile()?"File":"Dir";

            System.out.println(eachfile.getName() + "\t"+ eachfile.length() +"\t" + type);

        }

        Filtring findDOC = new Filtring("doc");
        File[] folderlist = folderIn.listFiles(findDOC);
        for (File eachfileinfolder: folderlist
             ) {
            try {
                FileOperation.fileCopy(eachfileinfolder, new File(folderOut, eachfileinfolder.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }




    }






}

