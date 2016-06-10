/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domparserdemo;

/**
 *
 * @author mark-4304
 */
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class DomParserDemo {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            File inputFile = new File("foodInput.xml");

            Document doc = builder.parse(inputFile);

            System.out.println("Root element = " + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("food");

            int serialNo = 1;
            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                System.out.println("Current element = " + nNode.getNodeName());

                Element element = (Element) nNode;
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println(serialNo + ". " + element.getElementsByTagName("name").item(0).getTextContent() + "  ( " + element.getElementsByTagName("price").item(0).getTextContent() + " )");
                    System.out.println("\t" + element.getElementsByTagName("description").item(0).getTextContent());
                    System.out.println("\n\t Calories : " + element.getElementsByTagName("calories").item(0).getTextContent());
                    System.out.println("--------------------------------------------------------------------------");
                    serialNo++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
