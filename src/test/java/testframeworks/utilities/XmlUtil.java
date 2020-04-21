package testframeworks.utilities;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlUtil {

	NodeList nodeList = null;
	Document doc = null;

	public XmlUtil(String filename) {

		File file = new File(filename);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// an instance of builder to parse the specified xml file
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			doc = db.parse(file);
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doc.getDocumentElement().normalize();
		//System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

	}

	public String getInfoFromXml(String tagName, int index, String nodeName) {

		nodeList = doc.getElementsByTagName(tagName);
		Element eElement = null;

		Node node = nodeList.item(index);
		//System.out.println("\nNode Name :" + node.getNodeName());

		if (node.getNodeType() == Node.ELEMENT_NODE) {
			eElement = (Element) node;

		}

		return eElement.getElementsByTagName(nodeName).item(0).getTextContent();

	}

}
