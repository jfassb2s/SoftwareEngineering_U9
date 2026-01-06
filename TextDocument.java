import java.io.UnsupportedEncodingException;

public class TextDocument extends CoreDocument {

    enum Encoding {
        UTF8,
        UTF16,
        UTF32
    }

    private Encoding encoding;
    private String text;

    public TextDocument(String text, Encoding encoding) {
        this.text = text;
        this.encoding = encoding;
    }

    @Override
    public int getSizeInBytes()  {

        try
        {
            switch (encoding) {
                case UTF8:
                    return text.getBytes("UTF-8").length;
                case UTF16:
                    return text.getBytes("UTF-16").length;
                case UTF32:
                    return text.getBytes("UTF-32").length;
            }
        }
        catch (UnsupportedEncodingException e) {}

        return 0;
    }

    public Encoding getEncoding() {
        return encoding;
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
