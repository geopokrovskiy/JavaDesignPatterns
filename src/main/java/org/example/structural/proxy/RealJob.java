package org.example.structural.proxy;
public class RealJob implements Job{

    private String jobName;

    public RealJob(String jobName) {
        this.jobName = jobName;
        System.out.println("The deadline is tomorrow!!!");
    }

    @Override
    public void doJob() {
        System.out.println("Work in progress...");
    }


}
