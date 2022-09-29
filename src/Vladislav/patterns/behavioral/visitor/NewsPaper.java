package Vladislav.patterns.behavioral.visitor;

import java.util.Arrays;

public class NewsPaper implements NewsPaperArticle {
    NewsPaperArticle[] newsPaperArticles;

    public NewsPaper() {
        newsPaperArticles = new NewsPaperArticle[] {
                new Colomn(),
                new Title()
        };
    }

    @Override
    public void beWritten(Writer writer) {
        Arrays.stream(newsPaperArticles).forEach(x -> x.beWritten(writer));
    }
}
