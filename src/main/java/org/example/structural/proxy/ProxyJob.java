package org.example.structural.proxy;
public class ProxyJob implements Job{
    private String jobName;
    private RealJob realJob;

    public ProxyJob(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void doJob() {
        if(this.realJob == null){
            this.realJob = new RealJob("Greatest project ever!");
        }
        this.realJob.doJob();
    }
}
