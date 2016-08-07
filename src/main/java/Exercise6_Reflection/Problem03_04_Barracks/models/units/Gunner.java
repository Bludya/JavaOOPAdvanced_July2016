package Exercise6_Reflection.Problem03_04_Barracks.models.units;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Gunner extends AbstractUnit {

    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}
