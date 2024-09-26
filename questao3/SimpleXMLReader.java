package questao3;


public class SimpleXMLReader implements XMLReader {
    @Override
    public void setContentHandler(ContentHandler handler) {
        System.out.println("Setando handler no SimpleXMLReader");
    }

    @Override
    public void parse(InputStream is) {
        System.out.println("Parsing com SimpleXMLReader");
    }
}