public class AdvancedXMLReader implements XMLReader {
    @Override
    public void setContentHandler(ContentHandler handler) {
        System.out.println("Setando handler no AdvancedXMLReader");
    }

    @Override
    public void parse(InputStream is) {
        System.out.println("Parsing com AdvancedXMLReader");
    }
}