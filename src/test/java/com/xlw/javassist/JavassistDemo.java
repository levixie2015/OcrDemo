package com.xlw.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

/**
 * 破解aspose
 * <p>https://blog.csdn.net/LSM0603/article/details/128329423?spm=1001.2101.3001.6650.17&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-17-128329423-blog-106273365.235%5Ev43%5Epc_blog_bottom_relevance_base4&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-17-128329423-blog-106273365.235%5Ev43%5Epc_blog_bottom_relevance_base4&utm_relevant_index=27</p>
 */
public class JavassistDemo {

    public static void main(String[] args) {
        try {
            ClassPool aDefault = ClassPool.getDefault();
            //取得需要反编译的jar文件，设定路径
            aDefault.insertClassPath("/Users/xieliwei/aspose-cells-20.5.jar");
            CtClass ctClass = aDefault.get("com.aspose.cells.License");
            CtMethod ctMethod = ctClass.getMethod("setLicense", "(Ljava/io/InputStream;)V");
            ctMethod.setBody("{ this.a = new com.aspose.cells.License();com.aspose.cells.zbis.a();}");
            CtMethod kMethod = ctClass.getDeclaredMethod("k");
            kMethod.setBody("{return new java.util.Date(4070880000000L);}");
            //
            // 获取String类型参数集合
			/*CtMethod[] declaredMethods = ctClass.getDeclaredMethods();
			for(CtMethod m:declaredMethods) {
				System.out.println(m.getMethodInfo());
			}*/
            //CtMethod atMethod = ctClass.getMethod("a", "(Ljava/lang/String;Ljava/lang/String;ZZ)Z");
            //atMethod.setBody("{ return true;}");
            //这里会将这个创建的类对象编译为.class文件
            ctClass.writeFile("/Users/xieliwei/");//不能为根目录
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}