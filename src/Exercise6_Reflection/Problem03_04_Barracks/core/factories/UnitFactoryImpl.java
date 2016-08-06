package Exercise6_Reflection.Problem03_04_Barracks.core.factories;


import Exercise6_Reflection.Problem03_04_Barracks.contracts.Unit;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.UnitFactory;
import Exercise6_Reflection.Problem03_04_Barracks.models.units.AbstractUnit;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "Exercise6_Reflection.Problem03_04_Barracks.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        AbstractUnit unit = null;
        try {
            unit = (AbstractUnit) Class.forName(UNITS_PACKAGE_NAME + unitType).newInstance();
        } catch (ClassNotFoundException cne) {
            throw new NotImplementedException();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return unit;
    }
}
