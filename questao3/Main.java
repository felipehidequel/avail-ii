package questao3;


public class Main {
    public static void main(String[] args) {
        // Usando a fábrica para criar um SimpleXMLReader
        XMLReaderFactory simpleFactory = new SimpleXMLReaderFactory();
        XMLReader simpleReader = simpleFactory.createXMLReader();
        simpleReader.parse(System.in);

        System.out.println("---");

        // Usando a fábrica para criar um AdvancedXMLReader
        XMLReaderFactory advancedFactory = new AdvancedXMLReaderFactory();
        XMLReader advancedReader = advancedFactory.createXMLReader();
        advancedReader.parse(System.in);
    }
}
