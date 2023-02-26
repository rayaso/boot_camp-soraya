package retryanalyzer;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import retryanalyzer.RetryAnalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TransformerAnalyzer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}
