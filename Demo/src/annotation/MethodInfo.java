package annotation;

import java.lang.annotation.Repeatable;

@Repeatable(value=MethodInfos.class)
public @interface MethodInfo {
	String author();
}
