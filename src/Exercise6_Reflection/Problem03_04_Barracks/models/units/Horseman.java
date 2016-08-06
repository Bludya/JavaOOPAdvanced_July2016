package Exercise6_Reflection.Problem03_04_Barracks.models.units;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Horseman extends AbstractUnit {
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
