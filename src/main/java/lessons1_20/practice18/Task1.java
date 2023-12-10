package lessons1_20.practice18;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

// Задача 1:
//Распарсить xml файл используя DOM парсер.
public class Task1 {
    public static void main(String[] args) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/main/resources/pr18.xml");
            Node root = document.getDocumentElement();

            System.out.println("Parsing file...");
            System.out.println("title:" + document.getElementsByTagName("title").item(0).getTextContent());
            NodeList nodes = root.getChildNodes();
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                // Если нода не текст, то заходим внутрь
                if (node.getNodeType() != Node.TEXT_NODE) {
                    NodeList props = node.getChildNodes();
                    for (int j = 0; j < props.getLength(); j++) {
                        Node prop = props.item(j);
                        // Если нода не текст, то это один из параметров, печатаем
                        if (prop.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(prop.getNodeName() + ":" + prop.getChildNodes().item(0).getTextContent());
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println();
        }
    }







}
