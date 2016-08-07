package Exercise2_Generics.Problem11_Threeuple.models;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class Threeuple<T1, T2, T3> extends Tuple<T1, T2> {
    private T3 thirdElement;

    public Threeuple(T1 firstElement, T2 secondElement, T3 thirdElement) {
        super(firstElement, secondElement);
        this.setThirdElement(thirdElement);
    }

    private T3 getThirdElement() {
        return thirdElement;
    }

    private void setThirdElement(T3 thirdElement) {
        this.thirdElement = thirdElement;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + this.getThirdElement().toString();
    }
}
