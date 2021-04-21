package resource;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author gentleman
 * @version 0.1.0
 * @create 2021-04-20 23:44
 * @since 0.1.0
 **/
public class ResourceTest {
    public static void main(String[] args) throws IOException {
        Class cl=ResourceTest.class;
        //Class.getResource()获取资源对象
        URL url=cl.getResource("about.gif");
        var icon=new ImageIcon(url);

        //Class.getResourceAsStream()获取资源对象，以流的方式进行读取
        InputStream stream1=cl.getResourceAsStream("data"+ File.separator+"about.txt");
        var about=new String(stream1.readAllBytes(),StandardCharsets.UTF_8);

        InputStream stream2=cl.getResourceAsStream(File.separator+"corejava"+File.separator+"tilte.txt");
        var  title=new String(stream1.readAllBytes(),StandardCharsets.UTF_8).trim();

        JOptionPane.showMessageDialog(null,about,title,JOptionPane.INFORMATION_MESSAGE,icon);

    }

}
