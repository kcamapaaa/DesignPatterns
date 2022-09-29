package Vladislav.patterns.behavioral.visitor;

public class Title implements NewsPaperArticle {
    @Override
    public void beWritten(Writer writer) {
        writer.create(this);
    }
}
