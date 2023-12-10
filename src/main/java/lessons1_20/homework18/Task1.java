package lessons1_20.homework18;

// Задача 1:
//Написать программу для парсинга xml документа. Необходимо распарсить xml документ и
//содержимое тегов line записать в другой документ. Название файла для записи должно
//состоять из значений тегов и имеет вид: <firstName>_<lastName>_<title>.txt

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) {

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/main/resources/pr18.xml");

            String firstname=document.getElementsByTagName("firstName").item(0).getTextContent();
            String lastname=document.getElementsByTagName("lastName").item(0).getTextContent();
            String title=document.getElementsByTagName("title").item(0).getTextContent();

            String fileName=firstname+ "_" + lastname + "_" + title + ".txt";

            FileWriter fileWriter=new FileWriter("src/main/resources/"+ fileName);
            NodeList nodes = document.getElementsByTagName("line");
            for (int i=0; i<nodes.getLength(); i++) {
                Node node= nodes.item(i);
                fileWriter.write(node.getTextContent() + "\n");
            }
            fileWriter.flush();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
