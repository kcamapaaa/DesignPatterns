package Vladislav.patterns.behavioral.visitor;

public class Colomn implements NewsPaperArticle {
    @Override
    public void beWritten(Writer writer) {
        writer.create(this);
    }
}
