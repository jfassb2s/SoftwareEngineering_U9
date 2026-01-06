import java.util.ArrayList;
import java.util.List;

public class ComplexDocument extends Document {
    private List<Document> children = new ArrayList<>();

    public void add(Document doc) {
        children.add(doc);
    }
    public void remove(Document doc) {
        children.remove(doc);
    }

    @Override
    public int getSizeInBytes() {
        int size = 0;
        for (Document doc : children) {
            size += doc.getSizeInBytes();
        }
        return size;
    }
}
