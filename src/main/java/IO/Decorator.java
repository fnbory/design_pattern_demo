package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author: fnbory
 * @Date: 2019/9/12 20:12
 */
public class Decorator {
    public static void main(String[] args) throws  Exception{
        InputStream inputStream=new FileInputStream("/test");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
    }
}
