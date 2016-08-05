package Exercise5_ObjectCommunicationsAndEvents.Problem03_DependencyInversionSkeleton;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Alias {
    char value();
}
