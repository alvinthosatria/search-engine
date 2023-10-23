import java.util.*;

// ## RELEASE 2
class DocumentMetadata {
    private String title;
    private String author;
    private Date createdDate;
    private List<String> tags;

    public DocumentMetadata(String title, String author, Date createdDate, List<String> tags) {
        this.title = title;
        this.author = author;
        this.createdDate = createdDate;
        this.tags = tags;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public List<String> getTags() {
        return tags;
    }
}


