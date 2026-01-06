public class TestClient {
    public static void main(String[] args) {
        ComplexDocument doc0 = new ComplexDocument();
        doc0.setId(0);

        TextDocument doc2 = new TextDocument("Die Klausur im Fach SE findet im März 2026 statt!", TextDocument.Encoding.UTF16);
        doc2.setId(2);
        doc0.add(doc2);

        ComplexDocument doc3 = new ComplexDocument();
        doc3.setId(3);
        doc0.add(doc3);

        TextDocument doc5 = new TextDocument("Software Engineering ist ein Vorlesung in den Studiengaengen BWI und BSCP!", TextDocument.Encoding.UTF32);
        doc5.setId(5);
        doc3.add(doc5);

        GraphicDocument doc4 = new GraphicDocument("localhost:8080");
        doc4.setId(4);
        doc3.add(doc4);

        System.out.printf("Size of doc%d is %d\n", doc0.getId(), doc0.getSizeInBytes());
        System.out.printf("Size of doc%d is %d\n", doc2.getId(), doc2.getSizeInBytes());
        System.out.printf("Size of doc%d is %d\n", doc3.getId(), doc3.getSizeInBytes());
        System.out.printf("Size of doc%d is %d\n", doc4.getId(), doc4.getSizeInBytes());
        System.out.printf("Size of doc%d is %d\n", doc5.getId(), doc5.getSizeInBytes());
    }
}