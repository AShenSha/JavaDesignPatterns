package adapter.impl2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * @author ShenSha on 2018/11/19
 */
public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document d;
            d = builder.parse(new File("src/main/java/adapter/impl2/config.xml"));
            NodeList nodeList = d.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
            Class c = Class.forName("adapter.impl2."+cName);
            Object o = c.newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
