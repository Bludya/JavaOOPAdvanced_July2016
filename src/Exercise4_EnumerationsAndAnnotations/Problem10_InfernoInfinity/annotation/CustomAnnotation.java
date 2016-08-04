package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.annotation;

import java.lang.annotation.*;

/**
 * Created by bludya on 8/4/16.
 * All rights reserved!
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented()
public @interface CustomAnnotation {
    String author();

    int revision();

    String description();

    String[] reviewers();
}
