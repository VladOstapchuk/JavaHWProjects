package homeworks.io;

import java.io.File;
import java.io.FileFilter;

public class Filtring implements FileFilter {
    protected String[] arr;

    public Filtring(String... arr) {
        this.arr = arr;
    }

    private boolean check(String ext) {
        for (String str : arr
        ) {

            if (str.equals(ext)) {
                return true;
            }
        }


        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointindex = pathname.getName().lastIndexOf(".");
        if(pointindex == -1){
            return false;
        }

        String ext = pathname.getName().substring(pointindex+1);

        return check(ext);
    }
}
