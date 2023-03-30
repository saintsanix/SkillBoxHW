import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.HashMap;
import java.util.Map;

public class XMLHandler extends DefaultHandler {

    private Voter voter;
    private Map<Voter, Integer> voterCounts;
    private long counts;

    public XMLHandler() {
        voterCounts = new HashMap<>();
    }

    @Override
    public void startDocument() {
        System.out.println("Start parsing");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        try {
            if (qName.equals("voter") && voter == null) {
                DBConnection.countVoter(attributes.getValue("name"), attributes.getValue("birthDay"));
                ++counts;
                System.out.println("voter # " + counts);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("voter")) {
            voter = null;
        }
    }

    @Override
    public void endDocument() {
        System.out.println("Stop parsing");
    }
}