package org.example.behavioural.memento;

public class ArticleRedactor {
    public static void main(String[] args) {
        Article article = new Article();
        Reviewer reviewer = new Reviewer();

        System.out.println("Writing new paper. Version 1.0");
        article.setVersionAndDate("Version 1.0");

        System.out.println(article);

        System.out.println("Sending paper to the reviewer");
        reviewer.setSave(article.save());

        System.out.println("Updatind paper to Version 1.1.");
        System.out.println("Writing wrong changes...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        article.setVersionAndDate("Version 1.1");

        System.out.println(article);

        System.out.println("Reviewer has declined the changes..");
        System.out.println("Rolling back to the old version...");
        article.load(reviewer.getSave());

        System.out.println("Paper after rollback: ");
        System.out.println(article);
    }
}
