package jdk_resource;

/**
 * @Author: fnbory
 * @Date: 2019/9/29 21:02
 */
public class TestRes {

    private static  TestRes res=new TestRes();
    public static void main(String[] args) {
        System.out.println(res.getClass().getClassLoader().getResource("test1.xml"));
        // path不能以/开头，/不会被处理
        System.out.println(res.getClass().getClassLoader().getResource("/test1.xml"));




        System.out.println(res.getClass().getResource("test1.xml"));
        // 从跟目录中获取，/ 会被处理掉
        System.out.println(res.getClass().getResource("/test1.xml"));
    }
}
