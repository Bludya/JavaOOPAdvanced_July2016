package Exercise6_Reflection.Problem03_04_Barracks;


import Exercise6_Reflection.Problem03_04_Barracks.contracts.Repository;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.Runnable;
import Exercise6_Reflection.Problem03_04_Barracks.contracts.UnitFactory;
import Exercise6_Reflection.Problem03_04_Barracks.core.Engine;
import Exercise6_Reflection.Problem03_04_Barracks.core.factories.UnitFactoryImpl;
import Exercise6_Reflection.Problem03_04_Barracks.data.UnitRepository;


public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
