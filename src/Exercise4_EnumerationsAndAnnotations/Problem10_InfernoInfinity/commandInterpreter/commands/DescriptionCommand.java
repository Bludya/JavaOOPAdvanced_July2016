package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.commandInterpreter.commands;

import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.annotation.CustomAnnotation;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.OutputWriter;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces.WeaponArchive;
import Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.models.WeaponImplementation;

/**
 * Created by bludya on 8/4/16.
 * All rights reserved!
 */
public class DescriptionCommand extends CommandImpl {

    public DescriptionCommand(OutputWriter writer, WeaponArchive archive, String[] commandTexts) {
        super(writer, archive, commandTexts);
    }

    @Override
    public String execute() {
        CustomAnnotation annotation = WeaponImplementation.class.getAnnotation(CustomAnnotation.class);
        this.writer.writeLine("Class description: " + annotation.description());

        return "Description printed";
    }
}
