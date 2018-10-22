package command.impl2;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.*;
import java.io.File;

/**
 * @author ShenSha
 */
public class XMLUtil {

    public static Object getBean(int i) {
        try {
            //创建文档对象
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            builder = docFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/main/java/command/impl2/config.xml"));
            NodeList nodeList = doc.getElementsByTagName("className");
            Node classNode = null;
            if (0 == i) {
                classNode = nodeList.item(0).getFirstChild();
            } else {
                classNode = nodeList.item(1).getFirstChild();
            }
            String name = classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName("command.impl2."+name);
            Object obj = c.newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


