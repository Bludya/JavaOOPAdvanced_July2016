package Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.jobHandling;

import java.util.LinkedList;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class JobList extends LinkedList<Job> implements JobDoneHandler {

    public boolean add(Job job) {
        job.setHandler(this);
        return super.add(job);
    }

    @Override
    public void handleJobDone(JobDoneEvent event) {
        this.remove(event.getJob());
        System.out.println(String.format("Job %s done!", event.getJob().getName()));
    }
}
