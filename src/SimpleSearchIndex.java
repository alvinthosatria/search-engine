import java.util.*;

class SimpleSearchIndex implements SearchIndex {
    private Map<String, List<Document>> index;

    public SimpleSearchIndex() {
        index = new HashMap<>();
    }

    public void addDocument(Document document) {
        String[] words = document.getContent().split("\\s+");
        for (String word : words) {
            index.computeIfAbsent(word, k -> new ArrayList<>()).add(document);
        }
    }

    @Override
    public List<Document> search(String query) {
        String[] keywords = query.toLowerCase().split("\\s+");
        Set<Document> result = new HashSet<>();

        for (String keyword : keywords) {
            if (index.containsKey(keyword)) {
                result.addAll(index.get(keyword));
            }
        }

        return new ArrayList<>(result);
    }
}