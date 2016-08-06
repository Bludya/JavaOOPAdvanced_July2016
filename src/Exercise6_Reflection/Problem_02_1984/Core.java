package Exercise6_Reflection.Problem_02_1984;

import Exercise6_Reflection.Problem_02_1984.interfaces.*;
import Exercise6_Reflection.Problem_02_1984.interfaces.Runnable;
import Exercise6_Reflection.Problem_02_1984.models.Institution;

import java.io.IOException;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Core implements Runnable {
    private OutputWriter writer;
    private InputReader reader;
    private Repository<SimpleEntity> entities;
    private Repository<ListenerEntity> listenerEntities;
    private EventHandler eventHandler;
    private Factory<SimpleEntity> entityFactory;
    private Factory<Institution> institutionFactory;
    private Factory<Change> changesFactory;

    public Core(
            InputReader reader,
            OutputWriter writer,
            Repository<SimpleEntity> entities,
            Repository<ListenerEntity> listenerEntities,
            EventHandler eventHandler,
            Factory<SimpleEntity> entityFactory,
            Factory<Institution> institutionFactory,
            Factory<Change> changesFactory) {
        this.writer = writer;
        this.reader = reader;
        this.entities = entities;
        this.listenerEntities = listenerEntities;
        this.eventHandler = eventHandler;
        this.entityFactory = entityFactory;
        this.institutionFactory = institutionFactory;
        this.changesFactory = changesFactory;
    }

    @Override
    public void run() throws IOException, ReflectiveOperationException {
        String[] input = reader.readLine().split("\\s+");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int p = Integer.parseInt(input[2]);

        this.readEntities(m);
        this.readInstitutions(n);
        this.readChanges(p);
        this.printResult();
    }

    private void printResult() {
        for (ListenerEntity listener : listenerEntities.getValues()) {
            writer.writeLine(listener.toString());
        }
    }

    private void readChanges(int amountOfChanges) throws IOException, ReflectiveOperationException {
        for (int i = 0; i < amountOfChanges; i++) {
            String[] changeInfo = reader.readLine().split("\\s+");
            Change change = changesFactory.produce(changeInfo);
            if (change == null) {
                continue;
            }
            String id = change.getId();
            SimpleEntity entity = entities.get(id);

            entity.implementChange(change);
        }
    }

    private void readInstitutions(int amountOfInstitutions) throws IOException, ReflectiveOperationException {
        for (int i = 0; i < amountOfInstitutions; i++) {
            String[] institutionInfo = reader.readLine().split("\\s+");
            ListenerEntity institution = institutionFactory.produce(institutionInfo);
            listenerEntities.add(institution.getId(), institution);
        }
    }

    private void readEntities(int amountOfEntities) throws IOException, ReflectiveOperationException {
        for (int i = 0; i < amountOfEntities; i++) {
            String[] entityInfo = reader.readLine().split("\\s+");
            SimpleEntity entity = entityFactory.produce(entityInfo);

            entities.add(entity.getId(), entity);
        }
    }


}
