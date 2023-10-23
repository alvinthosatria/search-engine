import java.util.*;

interface SearchIndex {
    List<Document> search(String query);

    void addDocument(Document document);
}