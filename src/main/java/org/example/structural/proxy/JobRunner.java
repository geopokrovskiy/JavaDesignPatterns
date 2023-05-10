package org.example.structural.proxy;

public class JobRunner {
    public static void main(String[] args) {
        Job job1 = new ProxyJob("Let's start?...");

        Job job2 = new ProxyJob("Let's start!");
        job2.doJob();
    }
}
