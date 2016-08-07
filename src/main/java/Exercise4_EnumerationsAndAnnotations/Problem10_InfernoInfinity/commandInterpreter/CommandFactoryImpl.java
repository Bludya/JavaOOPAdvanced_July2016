package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter.commands.*;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.*;

import java.io.IOException;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public class CommandFactoryImpl implements CommandFactory {
    private InputReader reader;
    private OutputWriter writer;
    private WeaponArchive archive;
    private WeaponFactory weaponFactory;

    public CommandFactoryImpl(
            InputReader reader,
            OutputWriter writer,
            WeaponArchive archive,
            WeaponFactory weaponFactory
    ) {
        this.setReader(reader);
        this.setWriter(writer);
        this.setArchive(archive);
        this.setWeaponFactory(weaponFactory);
    }

    private void setReader(InputReader reader) {
        this.reader = reader;
    }

    private void setWriter(OutputWriter writer) {
        this.writer = writer;
    }

    private void setArchive(WeaponArchive archive) {
        this.archive = archive;
    }

    private void setWeaponFactory(WeaponFactory weaponFactory) {
        this.weaponFactory = weaponFactory;
    }

    @Override
    public Command interpret() throws IOException {
        Command command;
        String[] input = reader.readLine().split(";");

        switch (input[0]) {
            case "Create":
                command = new CreateCommand(writer, archive, weaponFactory, input);
                break;
            case "Add":
                command = new AddCommand(writer, archive, input);
                break;
            case "Remove":
                command = new RemoveCommand(writer, archive, input);
                break;
            case "Print":
                command = new PrintCommand(writer, archive, input);
                break;
            case "Compare":
                command = new CompareCommand(writer, archive, input);
                break;
            case "Author":
                command = new AuthorCommand(writer, archive, input);
                break;
            case "Revision":
                command = new RevisionCommand(writer, archive, input);
                break;
            case "Description":
                command = new DescriptionCommand(writer, archive, input);
                break;
            case "Reviewers":
                command = new ReviewersCommand(writer, archive, input);
                break;
            case "END":
                command = new EndCommand(writer, archive, input);
                break;
            default:
                command = null;
        }

        return command;
    }
}
