package Exercise6_Reflection.Problem_02_1984;

import Exercise6_Reflection.Problem_02_1984.events.EventHandlerImpl;
import Exercise6_Reflection.Problem_02_1984.factories.ChangesFactory;
import Exercise6_Reflection.Problem_02_1984.factories.EntityFactory;
import Exercise6_Reflection.Problem_02_1984.factories.InstitutionFactory;
import Exercise6_Reflection.Problem_02_1984.interfaces.*;
import Exercise6_Reflection.Problem_02_1984.interfaces.Runnable;
import Exercise6_Reflection.Problem_02_1984.io.ConsoleReader;
import Exercise6_Reflection.Problem_02_1984.io.ConsoleWriter;
import Exercise6_Reflection.Problem_02_1984.models.Institution;
import Exercise6_Reflection.Problem_02_1984.repositories.CustomRepository;

import java.io.IOException;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        OutputWriter writer = new ConsoleWriter();
        InputReader reader = new ConsoleReader();

        Repository<SimpleEntity> entityRepository = new CustomRepository<>();
        Repository<ListenerEntity> institutionRepository = new CustomRepository<>();

        EventHandler eventHandler = new EventHandlerImpl(institutionRepository);
        Factory<SimpleEntity> entityFactory = new EntityFactory(eventHandler);
        Factory<Institution> institutionFactory = new InstitutionFactory();
        Factory<Change> changesFactory = new ChangesFactory(entityRepository);

        Runnable core = new Core(
                reader,
                writer,
                entityRepository,
                institutionRepository,
                eventHandler,
                entityFactory,
                institutionFactory,
                changesFactory);

        core.run();
    }
}
