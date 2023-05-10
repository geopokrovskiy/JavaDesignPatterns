package org.example.creational.singleton;

/*
В этом примере создаётся класс, хранящий в себе путь к директории по умолчанию.
Например, мы хотим каждый раз открывать браузер файловой системы на определенной директории,
которую мы можем установить вручную.
 */
public class DefaultDirectory {
    private static volatile DefaultDirectory defaultDirectory;
    private String directoryName;

    public static DefaultDirectory getInstance() {
        if (defaultDirectory == null) {
            synchronized (DefaultDirectory.class) {
                defaultDirectory = new DefaultDirectory();
            }
        }
        return defaultDirectory;
    }

    private DefaultDirectory() {

    }

    public String getDefaultDirectoryName() {
        return directoryName;
    }

    public void setDefaultDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }
}
