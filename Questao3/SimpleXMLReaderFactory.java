public class SimpleXMLReaderFactory extends XmlReaderFactory{
    @Override
    public XMLReader createXMLReader(){
        return new SimpleXMLReader();
    }
}