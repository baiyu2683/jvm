package com.zh.memoryregion;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 方法区OOM
 *
 * 借助CGLib不断动态生成类，填满方法区
 *
 * VM args: -XX:PermSize=3m -XX:MaxPermSize=3m
 *
 * @Author zh2683
 */
public class JavaMethodAreaOOM {

    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(HeapOOM.OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                    return proxy.invokeSuper(obj, args);
                }
            });
        }
    }
}
//Error occurred during initialization of VM
//java.lang.OutOfMemoryError: PermGen space
//    at java.lang.String.toLowerCase(String.java:2517)
//    at java.net.URL.<init>(URL.java:377)
//    at java.net.URL.<init>(URL.java:302)
//    at java.net.URL.<init>(URL.java:325)
//    at sun.net.www.ParseUtil.fileToEncodedURL(ParseUtil.java:272)
//    at sun.misc.Launcher.getFileURL(Launcher.java:460)
//    at sun.misc.Launcher$ExtClassLoader.getExtURLs(Launcher.java:192)
//    at sun.misc.Launcher$ExtClassLoader.<init>(Launcher.java:164)
//    at sun.misc.Launcher$ExtClassLoader$1.run(Launcher.java:148)
//    at sun.misc.Launcher$ExtClassLoader$1.run(Launcher.java:142)
//    at java.security.AccessController.doPrivileged(Native Method)
//    at sun.misc.Launcher$ExtClassLoader.getExtClassLoader(Launcher.java:141)
//    at sun.misc.Launcher.<init>(Launcher.java:71)
//    at sun.misc.Launcher.<clinit>(Launcher.java:57)
//    at java.lang.ClassLoader.initSystemClassLoader(ClassLoader.java:1489)
//    at java.lang.ClassLoader.getSystemClassLoader(ClassLoader.java:1474)


