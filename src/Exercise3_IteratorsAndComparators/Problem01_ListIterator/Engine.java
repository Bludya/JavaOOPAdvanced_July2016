package Exercise3_IteratorsAndComparators.Problem01_ListIterator;

import Exercise3_IteratorsAndComparators.Problem01_ListIterator.Collections.ListIterator;
import Exercise3_IteratorsAndComparators.Problem01_ListIterator.Interface.Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bludya on 7/26/16.
 * All rights reserved!
 */
public class Engine {
    private Iterable listIterator;

    public Engine() {
        this.setListIterator(new ListIterator(new ArrayList<>()));
    }

    private void setListIterator(Iterable listIterator) {
        this.listIterator = listIterator;
    }

    public void execute(String command) throws IllegalArgumentException {
        String[] commandElements = command.split("\\s+");
        switch (commandElements[0]) {
            case "Create":
                List<String> list = new ArrayList<>();
                list.addAll(Arrays.asList(commandElements).subList(1, commandElements.length));
                this.setListIterator(new ListIterator(list));
                break;
            case "Move":
                System.out.println(this.listIterator.move());
                break;
            case "Print":
                System.out.println(this.listIterator.print());
                break;
            case "HasNext":
                System.out.println(this.listIterator.hasNext());
                break;
        }
    }
}
