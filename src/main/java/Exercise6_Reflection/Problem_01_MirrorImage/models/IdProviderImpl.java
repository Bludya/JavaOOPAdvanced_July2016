package Exercise6_Reflection.Problem_01_MirrorImage.models;

import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.IdProvider;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class IdProviderImpl implements IdProvider {
    private int currentId;

    public IdProviderImpl() {
        this.currentId = 0;
    }

    @Override
    public int getId() {
        return currentId++;
    }
}
