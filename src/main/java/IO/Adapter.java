package IO;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 适配器模式
 * @Author: fnbory
 * @Date: 2019/9/12 19:10
 */

public class Adapter {
    public static void main(String[] args) throws Exception{
        FileOutputStream fileOutputStream=new FileOutputStream("/test");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.write("this is my test");
    }
}
