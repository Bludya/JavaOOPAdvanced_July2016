package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public enum Gems {
    RUBY(7, 2, 5),
    EMERALD(1, 4, 9),
    AMETHYST(2, 8, 4);

    private Map<Stats, Integer> stats;

    Gems(int strength, int agility, int vitality) {
        stats = new HashMap<>();
        this.stats.put(Stats.STRENGTH, strength);
        this.stats.put(Stats.AGILITY, agility);
        this.stats.put(Stats.VITALITY, vitality);
    }

    public Map<Stats, Integer> getStats() {
        return this.stats;
    }

}
