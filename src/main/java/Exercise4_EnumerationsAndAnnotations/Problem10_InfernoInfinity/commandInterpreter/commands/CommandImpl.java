package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter.commands;


import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.Command;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.OutputWriter;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponArchive;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public abstract class CommandImpl implements Command {
    protected OutputWriter writer;
    protected WeaponArchive archive;
    protected String[] commandTexts;

    protected CommandImpl(OutputWriter writer, WeaponArchive archive, String[] commandTexts) {
        this.setWriter(writer);
        this.setArchive(archive);
        this.setCommandTexts(commandTexts);
    }

    private void setWriter(OutputWriter writer) {
        this.writer = writer;
    }

    private void setArchive(WeaponArchive archive) {
        this.archive = archive;
    }

    private void setCommandTexts(String[] commandTexts) {
        this.commandTexts = commandTexts;
    }

    abstract public String execute();
}
