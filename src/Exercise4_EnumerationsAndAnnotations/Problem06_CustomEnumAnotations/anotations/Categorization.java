package Exercise4_EnumerationsAndAnnotations.Problem06_CustomEnumAnotations.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Categorization {
    String type();

    String category();

    String description();

}
