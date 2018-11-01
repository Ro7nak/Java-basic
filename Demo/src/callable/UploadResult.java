package callable;

import java.util.concurrent.Callable;

public class UploadResult implements Callable<Boolean> {
    private String taskName;
    public UploadResult(String name) {
        taskName = name;
    }

    @Override
    public Boolean call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " (Start) " + taskName);
        // Code for uploading result: Dummy implementation
        Boolean retValue = null;
        try {
            Thread.sleep(2000);
            // code to Upload result
            // Set retValue to true
            retValue = Boolean.TRUE;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            // Set retValue to false
             retValue = Boolean.FALSE;
        }
        System.out.println(Thread.currentThread().getName() + " (End) " + taskName);
        return retValue;
    }
}
