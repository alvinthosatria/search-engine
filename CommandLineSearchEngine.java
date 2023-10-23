import java.util.*;

public class CommandLineSearchEngine {
    public static void main(String[] args) {
        SimpleSearchIndex searchIndex = new SimpleSearchIndex();
        BasicSearchEngine searchEngine = new BasicSearchEngine(searchIndex);
        DocumentRepository documentRepository = new DocumentRepository();

        // ## RELEASE 2 ADD META DATA & RANK SEARCH RESULTS
        // DocumentMetadata metadata1 = new DocumentMetadata("Document 1", "John Doe", new Date(),
        //         Arrays.asList("tag1", "tag2"));
        // DocumentMetadata metadata2 = new DocumentMetadata("Document 2", "Jane Smith", new Date(),
        //         Arrays.asList("tag2", "tag3"));

        Document doc1 = new Document("document1.txt", "This is the content of document 1.");
        Document doc2 = new Document("document2.txt", "Content of document 2 is different.");
        Document doc3 = new Document("document3.txt", "Third document has its own content.");

        searchEngine.addDocument(doc1);
        searchEngine.addDocument(doc2);
        searchEngine.addDocument(doc3);

        documentRepository.addDocument(doc1);
        documentRepository.addDocument(doc2);
        documentRepository.addDocument(doc3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your search query (q to quit): ");
            String query = scanner.nextLine();

            if (query.equals("q")) {
                break;
            }

            List<Document> results = searchEngine.search(query);
            searchEngine.displayResults(results);
        }

        scanner.close();
    }
}