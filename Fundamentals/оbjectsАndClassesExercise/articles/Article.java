package оbjectsАndClassesExercise.articles;

public class Article {

    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void Rename (String newTitle) {
        this.title = newTitle;
    }

    public String getContent() {
        return content;
    }

    public void Edit (String newContent) {
        this.content = newContent;
    }

    public String getAuthor() {
        return author;
    }

    public void ChangeAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    @Override
    public String toString() {
        // "{title} - {content}: {author}"
        return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        //return "" + getTitle() + " - " + getContent() + ": " + getAuthor();
    }

}
