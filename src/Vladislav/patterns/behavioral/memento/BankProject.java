package Vladislav.patterns.behavioral.memento;

public class BankProject {
    private String article;

    public void setArticle(String article) {
        this.article = article;
    }

    public Snapshot saveInSnapshot() {
        return new Snapshot(article);
    }

    public String restoreFromSnapshot(Snapshot snapshot) {
        return article = snapshot.getArticle();
    }

    public String getArticle() {
        return article;
    }
}
