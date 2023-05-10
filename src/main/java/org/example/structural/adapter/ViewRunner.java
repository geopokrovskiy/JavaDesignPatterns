package org.example.structural.adapter;

public class ViewRunner {
    public static void main(String[] args) {
        View view = new AdapterJavaToView();
        view.getViewFromController();
        view.setView();
    }
}
