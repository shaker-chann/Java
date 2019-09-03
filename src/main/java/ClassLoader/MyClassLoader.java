package ClassLoader;

import java.io.*;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/15 17:54
 * @Version 1.0
 **/
public class MyClassLoader extends ClassLoader {
    private String root;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData=loadClassData(name);
        if (classData == null) {
            throw new ClassNotFoundException();
        } else {
            return defineClass(name, classData, 0, classData.length);
        }
    }

    private byte[] loadClassData(String className) {
        String fileName = root + File.separatorChar
                + className.replace('.', File.separatorChar) + ".class";
        InputStream ins = null;
        try {
            ins = new FileInputStream(fileName);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            int length = 0;
            while ((length = ins.read(buffer)) != -1) {
                baos.write(buffer, 0, length);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ins.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static void main(String[] args) {

        MyClassLoader classLoader = new MyClassLoader();
        classLoader.setRoot("C:\\temp");

        Class<?> testClass = null;
        try {
            testClass = classLoader.loadClass("com.ClassLoader.StaticClassDemo");
            Object object = testClass.newInstance();
            System.out.println(object.getClass().getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
