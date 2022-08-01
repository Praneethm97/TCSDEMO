package Analyzer;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Imethod implements IMethodInterceptor {

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext iTestContext) {
        List<IMethodInstance> l = new ArrayList<>();
        for(IMethodInstance method:list){
            Test t= method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
            if(t.priority()==1){
                l.add(method);
            }
        }
        return l;
    }
}
