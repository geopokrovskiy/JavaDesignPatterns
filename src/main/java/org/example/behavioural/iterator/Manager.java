package org.example.behavioural.iterator;

public class Manager implements Collection{
    private String name;
    private String[] languages;

    public Manager(String name, String[] languages) {
        this.name = name;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }


    @Override
    public Iterator getIterator() {
        return new LanguageIterator();
    }

    private class LanguageIterator implements Iterator{
        private int index;
        @Override
        public boolean hasNext() {
            return index < languages.length;
        }
        @Override
        public Object next() {
            return languages[index++];
        }
    }
}
