import java.util.ArrayList;
import java.util.List;

class DocumentRepository {
    private List<Document> documents;

    public DocumentRepository() {
        documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public List<Document> getAllDocuments() {
        return documents;
    }
}