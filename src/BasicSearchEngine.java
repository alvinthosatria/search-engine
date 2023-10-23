import java.util.*;

class BasicSearchEngine {
    private SearchIndex index;
    private List<Document> documents;

    public BasicSearchEngine(SearchIndex index) {
        this.index = index;
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        documents.add(document);
        index.addDocument(document);
    }

    public List<Document> search(String query) {
        return index.search(query);
    }

    public void displayResults(List<Document> results) {
        for (Document doc : results) {
            System.out.println("Name: " + doc.getName());
            System.out.println("Content: " + doc.getContent());
            System.out.println("---------------------------");
        }
    }
}
