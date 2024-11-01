public class Book {
    private Author author;
    private String name;
    private int publicationYear;

    public Book (Author author, String name, int publicationYear) {
        this.author = author;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
