package homeworks.files;

//Реализуйте метод который выведет на экран список всех каталогов расположенных в каталоге
//адрес которого будет параметром этого метода.

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class dirlist {
    public static void main(String[] args) {

        Scanner dirpath = new Scanner(System.in);
        System.out.println("Please enter path to the directory:");
        String path = dirpath.nextLine();
        dirlistmathod(path);

        //ver.1
        //File dir = new File(path);
        //File[] files = dir.listFiles();
        //for (int i = 0; i < files.length; i++) {
        //    System.out.println(result);

        //ver.2
        for (int i = 0; i < dirlistmathod(path).length; i++) {
            System.out.println(dirlistmathod(path)[i]);
            }
        //ver.3
        System.out.println(Arrays.deepToString(dirlistmathod(path)));
    }

        public static File[] dirlistmathod(String str){
            File dir = new File(str);
            return dir.listFiles();
        }


}
