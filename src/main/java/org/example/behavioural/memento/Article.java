package org.example.behavioural.memento;

import java.util.Date;

public class Article {
    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Article{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
