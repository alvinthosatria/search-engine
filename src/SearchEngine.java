import java.util.*;

// RELEASE 2
public class SearchEngine extends BasicSearchEngine {
    private SearchIndex index;

    public SearchEngine(SearchIndex index) {
        super(index);
        // add other attributes
    }

    @Override
    public List<Document> search(String query) {
        // custom search algorithm using ranking & metadata
        return index.search(query);
    }

    @Override
    public void displayResults(List<Document> results) {
        // custom display results
    }
}
