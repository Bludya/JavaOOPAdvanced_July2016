package Exercise6_Reflection.Problem_01_MirrorImage;

import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.InputReader;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.OutputWriter;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.Runnable;
import Exercise6_Reflection.Problem_01_MirrorImage.io.ConsoleReader;
import Exercise6_Reflection.Problem_01_MirrorImage.io.ConsoleWriter;

import java.io.IOException;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        OutputWriter writer = new ConsoleWriter();
        InputReader reader = new ConsoleReader();

        Runnable core = new Core(reader, writer);
        core.start();
    }
}
