public abstract class CoreDocument extends Document {

    public enum Type {
        Text,
        Graphic
    }

    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}