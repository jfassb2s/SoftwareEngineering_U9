public class GraphicDocument extends CoreDocument {
    public static final int SIZE = 1200;

    private String url;

    public GraphicDocument(String url) {
        this.url = url;
    }

    @Override
    public int getSizeInBytes() {
        return SIZE;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
