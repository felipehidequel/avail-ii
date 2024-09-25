public class AdvancedXMLReaderFactory extends XMLReaderFactory {
    @Override
    public XMLReader createXMLReader(){
        return new AdvancedXMLReader();
    }
}
