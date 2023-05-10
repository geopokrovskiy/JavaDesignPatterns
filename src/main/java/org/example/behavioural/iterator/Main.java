package org.example.behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("George", new String[]{"English", "French", "Russian", "Spanish", "Portuguese"});
        Iterator iterator = manager1.getIterator();

        System.out.println("Manager: "+ manager1.getName());
        System.out.println("Speaks: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
