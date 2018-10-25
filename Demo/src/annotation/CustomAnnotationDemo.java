package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class CustomAnnotationDemo {

	public static void main(String[] args) {
		NewStudent student = new DayScholar();
		Class c = student.getClass();
        //Fetches the list of annotations of the class, DayScholar
        Annotation annotations[] = c.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
             //Print the name of the annotation
             System.out.println(annotation.annotationType().getName());
             //Fetches the list of attributes of the annotation
             Method[] fields = annotation.annotationType().getDeclaredMethods();
             for (Method field : fields) {
                  //Print the attribute name 
                  System.out.print(field.getName());
                  //Fetch the value for the attribute
                  Object value = null;
				try {
					value = field.invoke(annotation, (Object[]) null);
				} catch (Exception e) {
					e.printStackTrace();
				}
                  System.out.println("\t" + value);
             }
        }

	}

}
