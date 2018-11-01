package lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterApp {

    public static void main(String[] args) {
        File directory = new File("C:\\Users\\rounak_goyanka\\eclipse-workspace\\Demo\\src\\io");
 
        File[] result = directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        });
        
        /*
         above function/anonymous function can be replaced by Lambda
         
         File[] result = directory.listFiles(pathname -> pathname.getName().endsWith(".java"));
         
         File[] result = directory.listFiles((File pathname) -> pathname.getName().endsWith(".java"));
         
         File[] result = directory.listFiles(pathname -> { return pathname.getName().endsWith(".java"); });
         
         */
        
        for(File file: result ){
            System.out.println(file.getName());
        }
    }
}