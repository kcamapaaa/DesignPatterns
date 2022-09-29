package Vladislav.patterns.behavioral.memento;

public class Snapshot {
    private String article;

    public Snapshot(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }
}
