package questao3;


public interface XMLReader{
    void setContentHandler(ContentHandler handler);
    void parse(InputStream is);
}