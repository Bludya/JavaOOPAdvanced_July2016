package Exercise6_Reflection.Problem03_04_Barracks.contracts;

public interface Repository {

    void addUnit(Unit unit);

    String getStatistics();

    void removeUnit(String unitType);
}
