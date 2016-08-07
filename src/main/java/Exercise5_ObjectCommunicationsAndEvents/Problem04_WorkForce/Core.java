package Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce;

import Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.employees.Employee;
import Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.employees.PartTimeEmployee;
import Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.employees.StandartEmployee;
import Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.jobHandling.Job;
import Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.jobHandling.JobList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Core {
    private JobList jobs;
    private Map<String, Employee> employees;

    public Core() {
        this.jobs = new JobList();
        this.employees = new HashMap<>();
    }

    public void startReading() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] command = reader.readLine().split("\\s+");

            switch (command[0]) {
                case "Job":
                    String name = command[1];
                    int hoursRequired = Integer.parseInt(command[2]);
                    String employeeName = command[3];

                    jobs.add(
                            new Job(
                                    name,
                                    hoursRequired,
                                    employees.get(employeeName)));
                    break;
                case "StandartEmployee":
                    String standartEmployeeName = command[1];
                    employees.put(standartEmployeeName, new StandartEmployee(standartEmployeeName));
                    break;
                case "PartTimeEmployee":
                    String partTimeEmployeeName = command[1];
                    employees.put(partTimeEmployeeName, new PartTimeEmployee(partTimeEmployeeName));
                    break;
                case "Pass":
                    Job[] jobsToUpdate = new Job[jobs.size()];
                    jobs.toArray(jobsToUpdate);
                    for (Job job : jobsToUpdate) {
                        job.finishWeek();
                    }
                    break;
                case "Status":
                    jobs.forEach(System.out::println);
                    break;
                case "End":
                    return;
            }


        }
    }
}
