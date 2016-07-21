package Exercise2_Generics.Problem07_CustomList.io;

import Exercise2_Generics.Problem07_CustomList.interfaces.CustomList;
import Exercise2_Generics.Problem07_CustomList.interfaces.IOManager;
import Exercise2_Generics.Problem07_CustomList.io.commands.*;

/**
 * Created by bludya on 7/20/16.
 * All rights reserved!
 */
public class StringCommandInterpreter extends CommandInterpreterImpl<String> {

    public StringCommandInterpreter(IOManager ioManager, CustomList<String> myList) {
        super(ioManager, myList);
    }

    @Override
    protected Command<String> parseCommand(String[] input) {
        String act = input[0];

        switch (act) {
            case "Add":
                String string = input[1];
                return new AddCommand<>(string, super.getIoManager(), super.getMyList());
            case "Remove":
                int index = Integer.parseInt(input[2]);
                return new RemoveCommand<>(index, super.getMyList(), super.getIoManager());
            case "Contains":
                String text = input[1];
                return new ContainsCommand<>(text, super.getMyList(), super.getIoManager());
            case "Swap":
                int index1 = Integer.parseInt(input[1]);
                int index2 = Integer.parseInt(input[2]);
                return new SwapCommand(index1, index2, super.getMyList(), super.getIoManager());
            case "Greater":
                String element = input[1];
                return new GreaterCommand<>(element, super.getMyList(), super.getIoManager());
            case "Max":
                return new MaxCommand<>(super.getMyList(), super.getIoManager());
            case "Min":
                return new MinCommand<>(super.getMyList(), super.getIoManager());
            case "Sort":
                return new SortCommand<>(super.getMyList(), super.getIoManager());
            case "Print":
                return new PrintCommand<>(super.getMyList(), super.getIoManager());
        }

        return null;
    }
}
