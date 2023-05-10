package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        DefaultDirectory.getInstance().setDefaultDirectoryName("users");
        System.out.println(DefaultDirectory.getInstance().getDefaultDirectoryName());
        System.out.println(DefaultDirectory.getInstance().getDefaultDirectoryName());
        System.out.println(DefaultDirectory.getInstance().getDefaultDirectoryName());
        DefaultDirectory.getInstance().setDefaultDirectoryName("files");
        System.out.println(DefaultDirectory.getInstance().getDefaultDirectoryName());
    }
}