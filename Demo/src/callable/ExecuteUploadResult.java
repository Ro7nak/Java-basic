package callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.ArrayList;


public class ExecuteUploadResult {
	public static void main (String[] args){
		ExecutorService exService = Executors.newSingleThreadExecutor();//1
		UploadResultCall uploadRunnable1 = new UploadResultCall(10);
		UploadResultCall uploadRunnable2 = new UploadResultCall(11);
		List<UploadResultCall> tasks = new ArrayList<>();
		tasks.add(uploadRunnable1);//2
		tasks.add(uploadRunnable2);//3
		try {
			exService.invokeAny(tasks); //4
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		exService.shutdown();
	}

}
