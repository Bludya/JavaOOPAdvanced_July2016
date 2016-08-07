package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces;

import java.io.IOException;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public interface CommandFactory {
    Command interpret() throws IOException;
}
