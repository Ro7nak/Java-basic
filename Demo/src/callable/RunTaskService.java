package callable;
import java.util.concurrent.*;

public class RunTaskService {
	
  public static void main(String[] args) {
	  
    ExecutorService exService = Executors.newSingleThreadExecutor();
    UploadResult uploadCallable = new UploadResult("Batch 1");
    Future<Boolean> future = exService.submit(uploadCallable);
    try {
        System.out.println("Upload completed: " + future.get());
    }
    catch(InterruptedException | ExecutionException e) {
        System.out.println(e.getMessage()); 
    }
    
 }
}
